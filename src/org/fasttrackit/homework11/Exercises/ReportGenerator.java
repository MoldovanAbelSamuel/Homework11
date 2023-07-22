package org.fasttrackit.homework11.Exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {

    private final Classroom classroom;
    public ReportGenerator(List<StudentGrade> reportList) {
        this.classroom = new Classroom(reportList);
    }


    public void generateReport () throws IOException {
        FileWriter fileWriter = new FileWriter("src/files/grade-reports.out");
        StudentGrade student = this.classroom.getMaxGrade();
        fileWriter.write("Cea mai mare nota: " + student.getName() + " " + student.getGrade() + "\n");
        fileWriter.write("Nota medie: " + this.classroom.getAverageGrade(null) + "\n");
        student = this.classroom.getWorstGrade();
        fileWriter.write("Cea mai mica nota: " + student.getName() + " " + student.getGrade() + "\n");
        fileWriter.flush();
    }
}
