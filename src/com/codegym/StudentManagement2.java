package com.codegym;

public class StudentManagement2 {

    public static void main(String[] args) {
        String[] studentNames = new String[4];
        studentNames[0] = "Trung";
        studentNames[1] = "Hoàng";
        studentNames[2] = "Khang";
        studentNames[3] = "Tân";

        for (String sName: studentNames) {
            System.out.println(sName);
        }
    }
}
