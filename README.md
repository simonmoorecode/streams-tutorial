# streams-tutorial
Materials for a tutorial on Java Streams.

This is a Maven project with a single dependency for JUNIT.

# Using Tutorial

There are 7 exercises.

Each exercise is implemented as a Unit test that will load up a List of Student objects and then call a static method on a corresponding class with this List.

The Student class and supporting Enums are in the domain package.

The objective is to implement the method called by the unit test using Java Streams API so that the test passes.

# Suggested order of exercises - Unit Tests:

* TestFilterStudentsByGrade
* TestGetStudentNames
* TestFindMinStudentAge
* TestCalculateAverageGrade
* TestGroupStudentsByCity
* TestCountStudentsByCity
* TestGetDistinctListOfSubjects

# Solutions
Example solutions are in the solutions package. Should remove these for tutorial!

# LoadStudents and students.csv
The data for the List of Student objects is in students.csv. The order and values of this is important as the unit tests assume this.
LoadStudents has a static method to read this file and construct a List of Students and each Unit Test calls this for test set up.
The LoadStudents has a main method and just prints out the student objects as loaded from the file students.csv.
