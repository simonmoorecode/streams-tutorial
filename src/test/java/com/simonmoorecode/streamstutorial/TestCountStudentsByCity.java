package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.City;
import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.CountStudentsByCity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TestCountStudentsByCity {
    private List<Student> testStudents;

    @Before
    public void before() throws IOException {
        testStudents=LoadStudents.loadStudentsFromFile("students.csv");
    }

    @Test
    /*
    Make this test pass by implementig CountStudentsByCity.getMapOfCityToNumberOfStudents
     */
    public void testCountStudentsByCity (){
        Map<City,Long> cityToNumberOfStudents = CountStudentsByCity.getMapOfCityToNumberOfStudents(testStudents);
        Assert.assertNotNull(cityToNumberOfStudents.get(City.Warsaw));
        Assert.assertNotNull(cityToNumberOfStudents.get(City.Krakow));
        Assert.assertNotNull(cityToNumberOfStudents.get(City.Poznan));

        Assert.assertEquals(3,cityToNumberOfStudents.get(City.Krakow).longValue());
        Assert.assertEquals(3,cityToNumberOfStudents.get(City.Warsaw).longValue());
        Assert.assertEquals(2,cityToNumberOfStudents.get(City.Poznan).longValue());
    }
}
