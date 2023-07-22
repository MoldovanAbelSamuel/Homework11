package org.fasttrackit.homework11.Exercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<StudentGrade> students = new ArrayList<>();
        students = StudentGrade.readFile("src/files/grades.txt");
        Classroom classroom = new Classroom(students);

        System.out.println("At mathematics we have next grades: " + classroom.getGradesForDIscipline("Mathematics"));
        System.out.println("Grades for Neela Amaltheia are: " + classroom.getGradesForStudent("Neela Amaltheia"));
        System.out.println("Max grade for computer science is: " + classroom.getMaxGrade("Computer Science"));
        System.out.println("Max grade in our class is: " + classroom.getMaxGrade());
        System.out.println("Average grade at discipline physics is: " + classroom.getAverageGrade("Physics"));
        System.out.println("Worst grade at computer science is: " + classroom.getWorstGrade("Computer Science"));
        System.out.println("Worst grade in our class is: " + classroom.getWorstGrade());

        ReportGenerator reportGenerator = new ReportGenerator(students);
        reportGenerator.generateReport();

    }

}
