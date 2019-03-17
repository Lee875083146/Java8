package com.nopainanymore.java8.Stream;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lw875
 * @create 2019-03-13 23:26
 */
public class StreamOperation {

    private static final Logger log = LoggerFactory.getLogger(StreamOperation.class);

    private static final Gson gson = new Gson();

    private final static String MALE = "男";

    private final static String FEMALE = "女";


    public static void main(String[] args) {
        List<Student> studentList = generateStudentList();
        filter(studentList);
    }

    private static List<Student> generateStudentList() {
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            Student student;
            if (i % 2 == 0) {
                student = new Student("a" + String.valueOf(i), 20, MALE, 1400 + i);
            } else {
                student = new Student("a" + String.valueOf(i), 21, FEMALE, 1400 + i);
            }
            studentList.add(student);
        }
        return studentList;
    }

    private static void filter(List<Student> studentList) {
        log.info("StreamOperation- filter- before :{}", gson.toJson(studentList));
        List<Student> afterFilter = studentList
                .stream()
                .filter(student -> MALE.equals(student.getSex()))
                .collect(Collectors.toList());
        log.info("StreamOperation- filter- after:{}", gson.toJson(afterFilter));
    }





}
