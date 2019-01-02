package com.simonmoorecode.streamstutorial.solutions;

import com.simonmoorecode.streamstutorial.domain.Student;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class FindMinStudentAge {
    public static int findMinAge(List<Student> students){
        //Map stream of students to a stream of integers and find the min in this stream
        //Can throw NoSuchElementException from getAsInt
        return students.stream().mapToInt(Student::getAge).min().getAsInt();

    }

    public static int findMinAgeSolution2(List<Student> students){
        //Use a Lambda expression as a comparator on the student objects in the stream
        //Can throw NoSuchElementException from get
        return students.stream().min(((s1,s2)->s1.getAge()-s2.getAge())).get().getAge();
    }

    public static int findMinAgeSolution3 (List<Student> students){
        //Use built in Comparator method
        //Can throw NoSuchElementException from get
        return students.stream().min(Comparator.comparingInt(Student::getAge)).get().getAge();
    }
}
