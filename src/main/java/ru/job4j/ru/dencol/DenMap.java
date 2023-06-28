package ru.job4j.ru.dencol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DenMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("zz@yandex.ru", "Denis");
        map.put("aa@mail.ru", "Alex");
        map.put("parsentev@yandex.ru", "Petrilo Arsenadze");
        //Set<String> keys = map.keySet();
        Set<Map.Entry<String, String>> keys1 = map.entrySet();
        //System.out.println("Ключи: " + keys1);
        for (Map.Entry<String, String> entry : keys1) {
            System.out.println(entry);
        }
        System.out.println();
        for (Map.Entry<String, String> entry : keys1) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " ... " + value);
        }
        // ArrayList<String> values = new ArrayList<>(map.values());
        //System.out.println("Значения: " + values);

        /*String value1 = map.get("zz@yandex.ru");
        System.out.println(value1);
        map.remove("parsentev@yandex.ru");
        for (String key : map.keySet()) {
           String value = map.get(key);
            System.out.println(key + " = " + value);
            System.out.println(key);*/
    }
}
