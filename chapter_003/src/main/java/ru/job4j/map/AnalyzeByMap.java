package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double counter = 0;
        double score = 0;
        for (Pupil pupil : pupils) {
            int amountSubject = pupil.subjects().size();
            counter += amountSubject;
            for (int index = 0; index < amountSubject; index++) {
                score += pupil.subjects().get(index).score();
            }
        }
        return score / counter;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new LinkedList<>();
        for (Pupil pupil : pupils) {
            int score = 0;
            int amountSubject = pupil.subjects().size();
            for (int index = 0; index < amountSubject; index++) {
                score += pupil.subjects().get(index).score();
            }
            int averageScore = score / amountSubject;
            result.add(new Label(pupil.name(), averageScore));
        }
        return result;
    }

    public static List<Label> averageScoreBySubjectsPupil(List<Pupil> pupils) {
        List<Label> result = new LinkedList<>();
        for (Pupil pupil : pupils) {
            int amountSubject = pupil.subjects().size();
            int score = 0;
            for (int index = 0; index < amountSubject; index++) {
                score += pupil.subjects().get(index).score();
            }
            int averageScore = score / amountSubject;
            result.add(new Label(pupil.name(), averageScore));
        }
        return result;
    }

    public static List<Label> averageScoreBySubjectPupils(List<Pupil> pupils) {
        List<Label> result = new LinkedList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            int amountSubject = pupil.subjects().size();
            for (int index = 0; index < amountSubject; index++) {
                map.merge(pupil.subjects().get(index).name(), pupil.subjects().get(index).score(), Integer::sum);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int score = entry.getValue() / pupils.size();
            result.add(new Label(entry.getKey(), score));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = averageScoreByPupil(pupils);
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> list = averageScoreBySubjectPupils(pupils);
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}