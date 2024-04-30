package com.GradeAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GradeAnalyzer {

    List<Integer> grades;

    public GradeAnalyzer(String  fileName) throws Exception {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            //1. convert all content to Integer
            //2. convert it into a List
            grades = stream
                    .map(val -> Integer.valueOf(val))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            throw new Exception(e.getMessage());
        }
    }

    public double getMeanGrade() {
        return  grades.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
    }

    public double getSandardDeviationGrade() {
        double mean = getMeanGrade();
        double standardDeviation = grades.stream().mapToDouble(x -> Math.pow(x - mean, 2)).sum();
        return Math.sqrt(standardDeviation/(grades.size() -1));
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public String getStudentGrade(int studentGrade, double meanGrade, double standardGrade) {

        if (studentGrade >= (meanGrade + 1.5 * standardGrade)) {
            return "A";
        } else if (studentGrade < (meanGrade + 1.5 * standardGrade) && studentGrade >= (meanGrade + 0.5 * standardGrade)) {
            return "B";
        } else if (studentGrade < (meanGrade + 0.5 * standardGrade) && studentGrade >= (meanGrade - 0.5 * standardGrade)) {
            return "C";
        } else if (studentGrade < (meanGrade - 0.5 * standardGrade) && studentGrade >= (meanGrade - 1.5 * standardGrade)) {
            return "D";
        } else {
            return "F";
        }
    }
}

