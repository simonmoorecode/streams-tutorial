package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.CalculateAverageGrade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

public class TestCalculateAverageGrade {
    private List<Student> testStudents;

    @Before
    public void before() throws IOException {
        testStudents=LoadStudents.loadStudentsFromFile("students.csv");
    }

    @Test
    public void testCalculateAverageGrade(){
        Assert.assertEquals(84.25, CalculateAverageGrade.findAverageGrade(testStudents).getAsDouble(),0);
    }

}
