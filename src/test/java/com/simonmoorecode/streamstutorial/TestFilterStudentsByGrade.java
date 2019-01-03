package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.FilterStudentsByGrade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TestFilterStudentsByGrade {
   private List<Student> testStudents;

    @Before
    public void before() throws IOException {
        testStudents=LoadStudents.loadStudentsFromFile("students.csv");
    }

    @Test
    public void testFilterStudentsByGrade (){

        //Call the method that should return a filtered list of students by grade threshold
        List<Student> studentsOverThreshold = FilterStudentsByGrade.filterByGrade(testStudents,90);

        //Make a List of expected Student Names for the test
        List<String> expectedStudentNames = new LinkedList<>();
        expectedStudentNames.add("Basia");
        expectedStudentNames.add("Gosia");
        expectedStudentNames.add("Marta");

        //Make a List of actual Student Names for the test
        List<String> actualStudentNames = new LinkedList<>();
        for(Student student:studentsOverThreshold) {
            actualStudentNames.add(student.getName());
        }
        //Assert that the lists of expected and actual names are the same
        Assert.assertEquals(expectedStudentNames,actualStudentNames);
    }
}
