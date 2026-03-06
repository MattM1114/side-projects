/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rgtstudentsytstem;

/**
 *
 * @author user
 */
public class RGTSTudentSytstem {

    public static void main(String[] args) {
        final String INSTITUTION_NAME = "Richfield Graduate Institute of Technology";
        final String MODULE_CODE = "PROG731";
        final int MAX_STUDENTS = 5;
        final int PASS_MARK = 50;
        String[] studentNames = {
                "Alice Dlamini",
                "Bob Smith",
                "Charlie Johnson",
                "Diana Lee",
                "Ethan Brown"
        };
        int[] studentNumbers = { 2023001, 2023002, 2023003, 2023004, 2023005 };
        byte[] studentages = { 21, 23, 19, 22, 20 };
        double[] examscores = { 78.5, 61.0, 45.5, 90.0, 55.5 };
        char[] studentGrades = { 'B', 'C', 'F', 'A', 'C' };
        boolean[] isErolled = { true, true, false, true, true };

        System.out.println("=====================================================\n"
                + INSTITUTION_NAME + "\nModule: " + MODULE_CODE +
                "\nTotal Students: " + MAX_STUDENTS +
                "\nMaxCohort: " + MAX_STUDENTS +
                "\n=====================================================");
        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.err.println("---Student " + (i + 1) + "---");
            System.out.println("Student Name: " + studentNames[i]);
            System.out.println("Student Number: " + studentNumbers[i]);
            System.out.println("Student Age: " + studentages[i]);
            System.out.println("Exam Score: " + examscores[i]);
            System.out.println("Student Grade: " + studentGrades[i]);
            System.out.println("Enrolled: " + (isErolled[i] ? "Yes" : "No"));
        }
        double HighestScore = 0.0;
        double LowestScore = 100.0;
        String HighestStudent = "";
        String LowestStudent = "";
        double total = 0.0;
        double average = 0.0;
        for (int i = 0; i < MAX_STUDENTS; i++) {
            if (examscores[i] > HighestScore) {
                HighestScore = examscores[i];
                HighestStudent = studentNames[i];

            }
            if (examscores[i] < LowestScore) {
                LowestScore = examscores[i];
                LowestStudent = studentNames[i];
            }
            total += examscores[i];
            average = total / MAX_STUDENTS;
        }
        System.out.println("=====================================================");
        System.out.println("Highest Score: " + HighestScore + " by " + HighestStudent);
        System.out.println("Lowest Score: " + LowestScore + " by " + LowestStudent);
        System.out.println("Average Score: " + average);

        int passedStudents = 0;
        int failedStudents = 0;

        for (int i = 0; i < MAX_STUDENTS; i++) {
            if (examscores[i] >= PASS_MARK) {
                passedStudents++;
            } else {
                failedStudents++;
            }
        }
        System.out.println("=====================================================");
        System.out.println("Passed Students: " + passedStudents);
        System.out.println("Failed Students: " + failedStudents);

        int gradea = 0;
        int gradeb = 0;
        int gradec = 0;
        int graded = 0;
        int gradef = 0;

        for (int i = 0; i < MAX_STUDENTS; i++) {
            switch (studentGrades[i]) {
                case 'A' -> gradea++;
                case 'B' -> gradeb++;
                case 'C' -> gradec++;
                case 'D' -> graded++;
                case 'F' -> gradef++;
            }
        }
        System.out.println(
                "=====================================================\nGrade Distribution:\nGradeA: " + gradea +
                        "\nGrade B: " + gradeb +
                        "\nGrade C: " + gradec +
                        "\nGrade D: " + graded +
                        "\nGradeF: " + gradef);

        double[][] assessments = {
                { 72.0, 80.0, 78.5 },
                { 60.0, 58.5, 61.0 },
                { 94.0, 92.5, 89.0 },
                { 60.5, 71.0, 65.5 },
                { 88.0, 85.0, 91.0 }
        };
        System.out.println("=====================================================\nStudent Assessments:");
        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("Student: " + studentNames[i]);
            System.out.println("Assessment 1: " + assessments[i][0]);
            System.out.println("Assessment 2: " + assessments[i][1]);
            System.out.println("Assessment 3: " + assessments[i][2]);
            System.out.println(
                    "Average Assessment Score: " + (assessments[i][0] + assessments[i][1] + assessments[i][2]) / 3);
            System.out.println("-----------------------------------------------------");
        }
        


    }
}
/*
1 .java file stores your code well while the 
.class file contains compiled bytecode which NetBeans typically stores in the build/classes directory

2 A byte is more efficient for age because it only uses 8 bits of memory to store values up to 127, 
whereas an int wastes 32 bits on a number that will never reach the millions.

3 The filename must match the public class name exactly so the Java compiler can reliably 
locate the correct source code during the compilation and linking process.

4 Array Indexing: Attempting to access assessmentScores[5] would crash your program with a 
java.lang.ArrayIndexOutOfBoundsException because the array only contains five rows indexed from 0 to 4.

5 Encapsulation could be used to wrap student data into a single object with private fields,
ensuring that scores can only be modified through controlled, 
validated methods.

*/
