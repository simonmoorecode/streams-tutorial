package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.FindMinStudentAge;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestFindMinStudentAge {
    private List<Student> testStudents;
    @Before
    public void before() throws IOException {
        testStudents=LoadStudents.loadStudentsFromFile("students.csv");
    }

    @Test
    //Make this test pass by implementing FindMinStudentAge.findMinAge
    public void findMinAge(){
        Assert.assertEquals(19, FindMinStudentAge.findMinAge(testStudents));
    }
}
