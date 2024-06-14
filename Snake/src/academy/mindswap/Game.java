package academy.mindswap;

import academy.mindswap.field.Field;
import academy.mindswap.field.Position;
import academy.mindswap.gameobjects.fruit.Fruit;
import academy.mindswap.gameobjects.snake.Direction;
import academy.mindswap.gameobjects.snake.Snake;
import com.googlecode.lanterna.input.Key;

public class Game {
    private Snake snake;
    private Fruit fruit;
    private int delay;

    public Game(int cols, int rows, int delay) {
        Field.init(cols, rows);
        snake = new Snake();
        this.delay = delay;
    }


    public void start() throws InterruptedException {
        generateFruit(); // uncomment when it's time to introduce fruits

        while (snake.isAlive()) {
            Thread.sleep(delay);
            Field.clearTail(snake);
            moveSnake();
            checkCollisions();
            Field.drawSnake(snake);
        }
    }

    private void generateFruit() {
        int row = RandomGenerator.generate(5, Field.getHeight() - 3);
        int column = RandomGenerator.generate(5, Field.getWidth() - 3);
        System.out.println("row = " + row);
        System.out.println("column = " + column);
        this.fruit = new Fruit(new Position(column, row));

        Field.drawFruit(fruit);
    }

    private void moveSnake() {

        Key k = Field.readInput();

        if (k != null) {
            switch (k.getKind()) {
                case ArrowUp:
                    if (snake.getDirection() != Direction.DOWN) {
                        snake.move(Direction.UP);
                    }
                    return;

                case ArrowDown:
                    if (snake.getDirection() != Direction.UP) {
                        snake.move(Direction.DOWN);
                    }
                    return;

                case ArrowLeft:
                    if (snake.getDirection() != Direction.RIGHT) {
                        snake.move(Direction.LEFT);
                    }
                    return;

                case ArrowRight:
                    if (snake.getDirection() != Direction.LEFT) {
                        snake.move(Direction.RIGHT);
                    }
                    return;
            }
        }
        snake.move();
    }

    private void checkCollisions() {
        if (snake.getHead().getCol() == 0 || snake.getHead().getRow() == 0 ||
            snake.getHead().getCol() == Field.getWidth() - 1 || snake.getHead().getRow() == Field.getHeight() - 1) {
            snake.die();
        }

        for (int i = 1; i < snake.getSnakeSize(); i++) {
            if (snake.getHead().equals(snake.getFullSnake().get(i))) {
                snake.die();
            }
        }

        System.out.println("Snake:"+snake.getHead());
        System.out.println("Fruit:"+fruit.getPosition());
        if (snake.getHead().equals(fruit.getPosition())) {
            snake.increaseSize();
            generateFruit();
        }
    }
}
