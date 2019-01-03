package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.GetDistinctListOfSubjects;
import com.simonmoorecode.streamstutorial.domain.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TestGetDistinctListOfSubjects {
    private List<Student> testStudents;

    @Before
    public void before() throws IOException {
        testStudents=LoadStudents.loadStudentsFromFile("students.csv");
    }

    @Test
    public void testGetDistinctListOfSubjects(){
        List<Subject> subjects = GetDistinctListOfSubjects.getDistinctListOfSubjects(testStudents);

        //Build a list of the expected values
        List<Subject> expectedSubjects = new LinkedList<>();
        expectedSubjects.add(Subject.MATHEMATICS);
        expectedSubjects.add(Subject.COMPUTER_SCIENCE);
        expectedSubjects.add(Subject.PHYSICS);
        expectedSubjects.add(Subject.ART_HISTORY);
        expectedSubjects.add(Subject.JOURNALISM);

        //assert the list of subjects returned is the same as the list of expected subjects
        Assert.assertEquals(expectedSubjects,subjects);
    }
}
