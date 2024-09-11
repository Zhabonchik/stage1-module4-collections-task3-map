package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.toLowerCase().split("[\\s,.]");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        map.remove("");
        return map;
    }
}
