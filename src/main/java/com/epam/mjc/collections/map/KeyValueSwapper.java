package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> answerMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (!answerMap.containsKey(value)) {
                answerMap.put(value, key);
            } else {
                if (answerMap.get(value) > key) {
                    answerMap.put(value, key);
                }
            }
        }
        return answerMap;
    }
}
