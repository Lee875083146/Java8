package com.nopainanymore.java8.optional;

import com.nopainanymore.java8.entity.Pet;
import com.nopainanymore.java8.entity.Student;

import java.util.Optional;

/**
 * @author nopainanymore
 * @time 2019-03-30 23:46
 */
public class UseOptional {


    public static void main(String[] args) {
        Student student = new Student();
        student.setStuId(1).setAge(18).setClassId(1).setName("na").setSex(Student.MALE);
        Optional<Student> studentOpt = Optional.ofNullable(student);
        if (studentOpt.isPresent()) {
            student = studentOpt.get();
        } else {
            System.out.println("student is null");
        }

        String name = studentOpt
                .map(Student::getName)
                .map(String::toUpperCase)
                .orElse("no name");

//        Student student = studentOpt.orElse(new Student());
//        Student student = studentOpt.orElseGet(Student::new);
//        Student student = studentOpt.orElseThrow(() -> new RuntimeException("student is not found"));

//        Student student = studentOpt
//                .filter(s -> s.getAge() > 10)
//                .orElseThrow(() -> new RuntimeException("student age not match"));

        String petName = studentOpt
                .flatMap(s -> Optional.ofNullable(s.getPet()))
                .map(Pet::getName)
                .orElse("no name");
        System.out.println(studentOpt.map(Student::getPet).map(Pet::getName).orElse("no name"));


    }
}
