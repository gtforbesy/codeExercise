package com.pyramid.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PyramidWordService {


    public boolean isPyramidWord(String word) {
        Map<String, Integer> letterMap = new HashMap<String, Integer>();
        for (String character : word.split("")) {
            if (letterMap.get(character) == null)
                letterMap.put(character, new Integer("1"));
            else
                letterMap.put(character, letterMap.get(character) + 1);
        }

        Set<Integer> values = new TreeSet(letterMap.values());
        if (values.size() != letterMap.size())
            return false; //duplicates

        for (int i = 1; i <= values.size(); i++) {
            if (!(values.contains(i)))
                return false;
        }

        return true;
    }
}
