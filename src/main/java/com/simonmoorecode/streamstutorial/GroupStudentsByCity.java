package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.City;
import com.simonmoorecode.streamstutorial.domain.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStudentsByCity {
    public static Map<City, List<Student>> getMapOfCityToListOfStudents (List<Student> students){
        return new HashMap<>();
    }
}
