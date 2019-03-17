package com.nopainanymore.java8.Stream;

import lombok.Data;

/**
 * @author lw875
 * @create 2019-03-13 23:31
 */
@Data
public class Student {

    private String name;

    private Integer age;

    private String sex;

    private Integer stuId;

    private Integer classId;

    public Student() {
    }

    public Student(String name, Integer age, String sex, Integer stuId, Integer classId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stuId = stuId;
        this.classId = classId;
    }


}
