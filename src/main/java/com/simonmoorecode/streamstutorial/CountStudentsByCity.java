package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.City;
import com.simonmoorecode.streamstutorial.domain.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStudentsByCity {
    /** This method currently returns an empty Map from City to Long.
     * Use Streams to construct a map from City to number of Students in each City.
     **/
    public static Map<City,Long> getMapOfCityToNumberOfStudents(List<Student> students) {

        return new HashMap<>();
    }
}
