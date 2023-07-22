package org.fasttrackit.homework11.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {

    private List<StudentGrade> classroom;

    public Classroom(List<StudentGrade> classroom) {
        this.classroom = classroom;
    }

    public List<Integer> getGradesForDIscipline (String discipline){
        List<Integer> grades = new ArrayList<>();
        for ( StudentGrade current : this.classroom ){
            if (Objects.equals(current.getDiscipline(), discipline)){
                grades.add(current.getGrade());
            }
        }
        return grades;
    }

    public List<Integer> getGradesForStudent (String student){
        List<Integer> grades = new ArrayList<>();
        for ( StudentGrade current : this.classroom ){
            if (Objects.equals(current.getName(), student)){
                grades.add(current.getGrade());
            }
        }
        return grades;
    }

    public StudentGrade getMaxGrade (String discipline){
        int maxGrade = 0;
        StudentGrade newStudent = null;
        for ( StudentGrade current : this.classroom ){
            if (Objects.equals(current.getDiscipline(), discipline) && current.getGrade() > maxGrade){
                maxGrade = current.getGrade();
                newStudent = current;
            }
        }
        return newStudent;
    }

    public StudentGrade getMaxGrade(){
        int index = 0;
        int maxGrade = 0;
        for(int i = 0; i < this.classroom.size(); i++){
            if (this.classroom.get(i).getGrade() > maxGrade) {
                maxGrade = this.classroom.get(i).getGrade();
                index = i;
            }
        }
        return this.classroom.get(index);
    }

    public Integer getAverageGrade (String discipline){
        int contor = 0;
        int sumGrades = 0;
        for (StudentGrade current : this.classroom){
            if (Objects.equals(current.getDiscipline(), discipline) || discipline == null){
                contor++;
                sumGrades += current.getGrade();
            }
        }
        return sumGrades/contor;
    }



    public StudentGrade getWorstGrade (String discipline){
        int index = 0;
        int minGrade = 11;
        for(int i = 0; i < this.classroom.size(); i++){
            if (Objects.equals(this.classroom.get(i).getDiscipline(), discipline) && this.classroom.get(i).getGrade() < minGrade) {
                minGrade = this.classroom.get(i).getGrade();
                index = i;
            }
        }
        return this.classroom.get(index);
    }

    public StudentGrade getWorstGrade (){
        int index = 0;
        int minGrade = 11;
        for(int i = 0; i < this.classroom.size(); i++){
            if (this.classroom.get(i).getGrade() < minGrade) {
                minGrade = this.classroom.get(i).getGrade();
                index = i;
            }
        }
        return this.classroom.get(index);
    }
}
