package org.fasttrackit.homework11.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrade {
    private String name;
    private String discipline;
    private int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static List<StudentGrade> readFile (String path) throws IOException {
        File studentFile = new File(path);
        Scanner scanner = new Scanner(studentFile);

        List<String> eachStudentLine = new ArrayList<>();

        while (scanner.hasNextLine()){
            String currentLine = scanner.nextLine();
            eachStudentLine.add(currentLine);
        }


        List<StudentGrade> student = new ArrayList<>();

        for (String currentLine : eachStudentLine){
            String[] separat = currentLine.split("\\|");
            StudentGrade currentStudent = new StudentGrade(separat[0], separat[1], Integer.parseInt(separat [2]) );
            student.add(currentStudent);
        }
        return student;

    }
}
