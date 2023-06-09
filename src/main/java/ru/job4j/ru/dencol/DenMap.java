package ru.job4j.ru.dencol;

import java.util.HashMap;
import java.util.Map;

public class DenMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("zz@yandex.ru", "Denis");
        String value1 = map.get("zz@yandex.ru");
        System.out.println(value1);
        map.remove("parsentev@yandex.ru");
        for (String key : map.keySet()) {
           String value = map.get(key);
            System.out.println(key + " = " + value);
            System.out.println(key);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
