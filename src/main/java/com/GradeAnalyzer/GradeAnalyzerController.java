package com.GradeAnalyzer;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Pair;

public class GradeAnalyzerController implements Initializable {

    GradeAnalyzer gradeAnalyzer;

    @FXML
    private TextArea textAreaDisplay;


    public void initialize(URL location, ResourceBundle resources) {

        String filename = "sample.txt";
        try {
            gradeAnalyzer = new GradeAnalyzer(filename);
        } catch (Exception e) {
            dialogHandler("ERROR: " + e.getMessage());
        }
    }

    @FXML
    private void gradeAnalyzerAction(ActionEvent event) {

        try {
            double mean = gradeAnalyzer.getMeanGrade();
            double sd =  gradeAnalyzer.getSandardDeviationGrade();

            String report = String.format("There were %s exams %n", gradeAnalyzer.getGrades().size());
            report += String.format("Mean : %.2f %n", mean);
            report += String.format("Std. Deviation : %.2f %n%n", sd);
            report += String.format("Scores Grade %n");

            Stream<Pair<Integer, String>> gradeAndLetters = gradeAnalyzer.getGrades().stream().
                    map(x -> new Pair <Integer, String> (x, gradeAnalyzer.getStudentGrade(x, mean, sd)));

            report += gradeAndLetters.map(entry ->
                    String.format("%d  %s %n", entry.getKey(), entry.getValue())).
                    collect(Collectors.joining());

            textAreaDisplay.setText(report);
        } catch (Exception ex) {
            dialogHandler("Error: " + ex.getMessage());
        }
    }

    private void dialogHandler(String message) {
        Dialog dialog = new Dialog();
        dialog.setTitle("Dialog");
        ButtonType button = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        //Setting the content of the dialog
        dialog.setContentText(message);
        //Adding buttons to the dialog pane
        dialog.getDialogPane().getButtonTypes().add(button);
        dialog.showAndWait();
    }
}




