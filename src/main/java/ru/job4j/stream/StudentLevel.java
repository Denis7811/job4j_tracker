package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted((left, right) -> Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(student -> student.getScore() >= bound)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input = StudentLevel.levelOf(input, 20);
        System.out.println(input);
    }
}
