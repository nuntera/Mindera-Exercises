package com.mindera.mindswap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordHistogram implements Iterable<String> {
    Map<String, Integer> wordHistogram = new HashMap();


    public void analyseString(String toAnalyse) {
        String[] onlyWords = toAnalyse.toLowerCase().split("\\s+");

        for(int i = 0; i < onlyWords.length; ++i) {
            String word = onlyWords[i];
            if (wordHistogram.containsKey(word)) {
                Integer count = wordHistogram.get(word);
                wordHistogram.replace(word, count + 1);
                continue;
            }
            this.wordHistogram.put(word, 1);
        }
    }


    public Integer get(String word) {
        return wordHistogram.get(word);
    }

    @Override
    public Iterator<String> iterator() {
        return wordHistogram.keySet().iterator();
    }
}
