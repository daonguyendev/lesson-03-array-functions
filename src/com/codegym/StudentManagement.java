package com.codegym;

public class StudentManagement {

    public static void main(String[] args) {
        C06Student s1 = new C06Student(1, "Khang", 19, true);
        C06Student s2 = new C06Student(2, "Tân", 18, true);
        C06Student s3 = new C06Student(3, "Trung", 20, true);
        C06Student s4 = new C06Student(4, "Hoàng", 20, true);

        C06Student[] c06Students = new C06Student[4];
        c06Students[0] = s1;
        c06Students[1] = s2;
        c06Students[2] = s3;
        c06Students[3] = s4;

        for (C06Student student : c06Students) {
            System.out.println(student);
        }
    }
}
