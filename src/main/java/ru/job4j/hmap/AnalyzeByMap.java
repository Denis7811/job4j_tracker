package ru.job4j.hmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double averageScore = 0;
        for (Pupil pupil : pupils) {
            double scoreSubjects = 0;
            for (Subject subject : pupil.subjects()) {
                scoreSubjects = scoreSubjects + subject.score();
            }
            double scorePupil = scoreSubjects / pupil.subjects().size();
            averageScore = averageScore + scorePupil;
        }
        return averageScore / pupils.size();
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> averageScoreByPupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scoreSubjects = 0;
            for (Subject subject : pupil.subjects()) {
                scoreSubjects = scoreSubjects + subject.score();
            }
            double scorePupil = scoreSubjects / pupil.subjects().size();
            Label pupilLabel = new Label(pupil.name(), scorePupil);
            averageScoreByPupil.add(pupilLabel);
        }
        return averageScoreByPupil;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> scoreBySubject = new LinkedHashMap<>();
        List<Label> averageScoreBySubject = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoreBySubject.merge(subject.name(), subject.score(),
                        (oldValue, newValue) -> oldValue + newValue);
            }
        }
        for (Map.Entry<String, Integer> entry : scoreBySubject.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue() / pupils.size();
            Label subjectLabel = new Label(key, value);
            averageScoreBySubject.add(subjectLabel);
        }

        return averageScoreBySubject;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> scoreByPupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scoreSubjects = 0;
            for (Subject subject : pupil.subjects()) {
                scoreSubjects = scoreSubjects + subject.score();
            }
            Label pupilLabel = new Label(pupil.name(), scoreSubjects);
            scoreByPupil.add(pupilLabel);
        }
        Collections.sort(scoreByPupil);

        return scoreByPupil.get(scoreByPupil.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> scoreBySubject = new LinkedHashMap<>();
        List<Label> averageScoreBySubject = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                scoreBySubject.merge(subject.name(), subject.score(),
                        (oldValue, newValue) -> oldValue + newValue);
            }
        }
        for (Map.Entry<String, Integer> entry : scoreBySubject.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            Label subjectLabel = new Label(key, value);
            averageScoreBySubject.add(subjectLabel);
        }
        Collections.sort(averageScoreBySubject);

        return averageScoreBySubject.get(averageScoreBySubject.size() - 1);
    }
}
