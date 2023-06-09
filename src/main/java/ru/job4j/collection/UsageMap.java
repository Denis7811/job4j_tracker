package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zz1@gmail.com", "Denis Alex Zotin");
        map.put("zz2@gmail.com", "Alex Mih Petrov");
        map.put("zz1@gmail.com", "Denis Vlad Vedv");
        map.put("zz2@gmail.com", "Mih Kutuz Grinev");
        map.put("zz3@gmail.com", "Ivan Andreev Krilov");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
