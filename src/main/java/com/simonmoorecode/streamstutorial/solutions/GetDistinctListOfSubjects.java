package com.simonmoorecode.streamstutorial.solutions;

import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.domain.Subject;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetDistinctListOfSubjects {
    //Need to use flatMap, which maps elements of the first stream (of students) to a stream of subjects (in this example).
    //Uses distinct and then collects into a list
    public static List<Subject> getDistinctListOfSubjects(List<Student> students) {
        return students.stream().flatMap(student->student.getSubjects().stream()).distinct().collect(Collectors.toList());
    }
}
