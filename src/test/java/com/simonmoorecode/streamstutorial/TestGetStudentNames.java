package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.GetStudentNames;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestGetStudentNames {
    private List<Student> testStudents;

    @Before
    public void before() throws IOException {
        testStudents=LoadStudents.loadStudentsFromFile("students.csv");
    }

    @Test
    public void testGetStudentNames(){
        //Call the method being tested
        List<String> actualStudentNames = GetStudentNames.getStudentNames(testStudents);
        //Make a list of expectedNames
        List<String> expectedNames = new ArrayList<>();
        expectedNames.add("Kasia");
        expectedNames.add("Basia");
        expectedNames.add("Piotr");
        expectedNames.add("Kryzstof");
        expectedNames.add("Gosia");
        expectedNames.add("Artur");
        expectedNames.add("Marcin");
        expectedNames.add("Marta");

        //Assert actual names returned by getStudentNames is the same as the list of expectedNames
        Assert.assertEquals(expectedNames,actualStudentNames);
    }
}
