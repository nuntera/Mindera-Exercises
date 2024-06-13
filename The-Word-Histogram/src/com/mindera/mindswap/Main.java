package com.mindera.mindswap;


public class Main {
    public static void main(String[] args) {

        WordHistogram histogram = new WordHistogram();
        histogram.analyseString(getText());
        for (String word : histogram)
            System.out.println(histogram.get(word));

        Integer someWord = histogram.get("pariatur");
        System.out.println("Word count: " + someWord);
    }

    static String getText() {
        return """
                Bacon ipsum dolor amet capicola ut ham hock spare ribs pork. Sausage ut andouille, capicola commodo tail non laborum picanha nisi t-bone rump dolor. Ham hock sed voluptate laborum swine andouille chicken chislic magna mollit kevin tenderloin. Beef labore chuck doner landjaeger, chicken chislic. Cupim turkey quis doner.
                Meatball sausage in pig proident salami. Alcatra filet mignon aliqua frankfurter eu. Enim cillum reprehenderit, adipisicing shank velit pastrami rump. Chicken brisket ut jowl esse dolore turducken excepteur adipisicing rump lorem in qui ham hock meatloaf.
                In nostrud commodo, occaecat cupim nisi ut biltong exercitation ground round jerky dolor qui pastrami. Do dolore voluptate, minim landjaeger leberkas id reprehenderit drumstick beef ribs sausage. Pork belly pariatur dolore tri-tip andouille. Brisket drumstick bacon pork belly, laborum doner short ribs spare ribs corned beef. Shank eu frankfurter, ut non beef minim chuck.
                Nulla lorem frankfurter labore. Chislic ullamco tongue dolore bacon. Cow hamburger in duis adipisicing leberkas shank. Aute magna ground round, laborum ea commodo meatloaf tempor prosciutto. Deserunt nulla ad aute pork loin proident excepteur turkey. Pork belly chicken quis qui, boudin spare ribs pariatur do tri-tip pork loin velit pork bacon. Ham sausage cow frankfurter in nostrud tri-tip voluptate swine pastrami dolore.
                Consectetur ea minim, ham jerky beef cupim aliquip cupidatat tri-tip buffalo. Frankfurter ad fugiat, tenderloin porchetta magna in veniam aute. Do frankfurter strip steak andouille tail filet mignon consequat corned beef anim, ut brisket. Quis jowl labore, pork loin aliquip nisi occaecat mollit deserunt sint ipsum buffalo pork dolore sausage. Sint fugiat irure burgdoggen doner. Short ribs officia cupim nisi consectetur id. Dolor tail nostrud cow corned beef ipsum.
                Lorem excepteur salami bacon ipsum. Doner consequat chislic, in reprehenderit shank voluptate qui fugiat. Commodo ea pastrami voluptate veniam eiusmod velit jowl pork chop bresaola. Pastrami adipisicing salami dolor, meatloaf voluptate consequat flank ut ham hock in capicola hamburger landjaeger. Esse proident strip steak minim turkey dolore qui beef andouille aliqua elit occaecat picanha fatback.
                Anim kielbasa leberkas, fatback short ribs rump capicola pariatur tongue t-bone short loin ball tip doner. Pig ham hock cupidatat corned beef, short loin commodo velit biltong fatback bacon cow shoulder lorem id tenderloin. Sausage ut deserunt, eu bacon frankfurter shankle salami strip steak reprehenderit. Aute exercitation doner in picanha veniam, ground round jowl shoulder commodo short loin. Adipisicing ut id, cillum aliquip laboris mollit swine non chislic capicola prosciutto.
                Voluptate rump bacon, commodo burgdoggen pig turducken id fugiat short loin culpa officia buffalo beef. Et picanha chicken eu, doner shank cupim qui. Chicken turkey velit strip steak tongue cupim in fugiat aute ex eiusmod frankfurter shankle. Nostrud biltong et, shankle proident ut cupim tri-tip. Picanha burgdoggen ipsum in biltong. Ullamco ribeye corned beef frankfurter tongue. Enim pastrami drumstick tenderloin pariatur beef ribs venison qui short ribs sunt beef.
                Pork in commodo swine quis pork chop tri-tip ipsum. Consectetur kevin dolor labore, quis sausage ullamco hamburger excepteur shank voluptate kielbasa alcatra chislic boudin. Picanha sunt corned beef, landjaeger chuck esse fatback. Eu consequat cow alcatra prosciutto, chicken t-bone ut proident incididunt ipsum ut tri-tip esse sed. Qui kevin irure et biltong ham hock filet mignon.
                Ullamco ut duis commodo id, aliquip buffalo rump. Tenderloin short loin pork loin, venison t-bone ipsum aliqua proident cupidatat. Dolore jerky t-bone, voluptate sirloin exercitation ad in andouille swine alcatra. Prosciutto labore sed ipsum ribeye. Chislic laboris shank cupidatat, boudin lorem laborum adipisicing voluptate brisket porchetta meatloaf. Boudin adipisicing pork chop anim voluptate duis rump. Adipisicing consequat ut bresaola sausage tongue dolore biltong fugiat est magna tri-tip drumstick.
                Does your lorem ipsum text long for something a little meatier? Give our generator a try… it's tasty!
                """;

    }
}
