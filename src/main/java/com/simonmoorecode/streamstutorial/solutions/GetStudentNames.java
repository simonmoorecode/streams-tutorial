package com.simonmoorecode.streamstutorial.solutions;

import com.simonmoorecode.streamstutorial.domain.Student;

import java.util.List;
import java.util.stream.Collectors;

public class GetStudentNames {
    public static List<String> getStudentNames(List<Student> students){
        return students.stream().map(Student::getName).collect(Collectors.toList());
    }
}
