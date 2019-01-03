package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.City;
import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.GroupStudentsByCity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestGroupStudentsByCity {
    private List<Student> testStudents;

    @Before
    public void before() throws IOException {
        testStudents=LoadStudents.loadStudentsFromFile("students.csv");
    }

    @Test
    public void testGroupStudentsByCity(){
        //Get a Map of City to List Of Students
        //You need to implement GroupStudentsByCity.getMapOfCityToListOfStudents

        Map<City,List<Student>> cityToStudents = GroupStudentsByCity.getMapOfCityToListOfStudents(testStudents);

        //Assert list of students for each City is not null
        Assert.assertNotNull(cityToStudents.get(City.Warsaw));
        Assert.assertNotNull(cityToStudents.get(City.Krakow));
        Assert.assertNotNull(cityToStudents.get(City.Poznan));

        //Prepare Lists of expected students for each City
        List<String> expectedKrakowStudents = new LinkedList<>();
        expectedKrakowStudents.add("Piotr");
        expectedKrakowStudents.add("Kryzstof");
        expectedKrakowStudents.add("Artur");

        List<String> expectedPoznanStudents = new LinkedList<>();
        expectedPoznanStudents.add("Gosia");
        expectedPoznanStudents.add("Marta");

        List<String> expectedWarsawStudents = new LinkedList<>();
        expectedWarsawStudents.add("Kasia");
        expectedWarsawStudents.add("Basia");
        expectedWarsawStudents.add("Marcin");


        //Get the Actual List of names for each City
        List<String> actualPoznanStudents = new LinkedList<>();
        for(Student student : cityToStudents.get(City.Poznan)){
            actualPoznanStudents.add(student.getName());
        }

        List<String> actualWarsawStudents = new LinkedList<>();
        for(Student student : cityToStudents.get(City.Warsaw)){
            actualWarsawStudents.add(student.getName());
        }

        List<String> actualKrakowStudents = new LinkedList<>();
        for(Student student : cityToStudents.get(City.Krakow)){
            actualKrakowStudents.add(student.getName());
        }
        //Test the results
        Assert.assertEquals(expectedPoznanStudents,actualPoznanStudents);
        Assert.assertEquals(expectedKrakowStudents,actualKrakowStudents);
        Assert.assertEquals(expectedWarsawStudents,actualWarsawStudents);
    }

}
