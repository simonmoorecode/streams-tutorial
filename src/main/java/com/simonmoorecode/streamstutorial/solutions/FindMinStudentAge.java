package com.simonmoorecode.streamstutorial.solutions;

import com.simonmoorecode.streamstutorial.domain.Student;
import java.util.List;
import java.util.OptionalInt;

public class FindMinStudentAge {
    public static int findMinAge(List<Student> students){
        //Can throw NoSuchElementException from getAsInt
        return students.stream().mapToInt(Student::getAge).min().getAsInt();

    }
}
