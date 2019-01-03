package com.simonmoorecode.streamstutorial;

import com.simonmoorecode.streamstutorial.domain.City;
import com.simonmoorecode.streamstutorial.domain.Student;
import com.simonmoorecode.streamstutorial.domain.Subject;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoadStudents {
    public static List<Student> loadStudentsFromFile(String studentFileName) throws IOException {
            File studentFile = new File (studentFileName);
            InputStream studentFS = new FileInputStream(studentFile);
            BufferedReader bufferedStudents = new BufferedReader(new InputStreamReader(studentFS));
            return bufferedStudents.lines().map(LoadStudents::mapToStudent).collect(Collectors.toList());
            
    }

    private static Student mapToStudent(String fileLine){
        String [] parsedLine = fileLine.split(",");
        return new Student(parsedLine[0],
                Integer.valueOf(parsedLine[1]),
                City.valueOf(parsedLine[2]),
                Double.valueOf(parsedLine[3]),
                Arrays.stream(parsedLine).skip(4).map(Subject::valueOf).collect(Collectors.toList()));
    }

    public static void main (String [] args){
        String studentFileName;
        if (args !=null && args.length>0){
            studentFileName=args[0];
            System.out.println("Setting Student File Name to "+studentFileName);
        } else {
            System.out.println("Defaulting Student File Name to students.csv");
            studentFileName="students.csv";
        }
        System.out.println ("Loading students from file");
        try {
            List<Student> students = loadStudentsFromFile(studentFileName);
            students.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
