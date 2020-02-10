package com.nopainanymore.java8.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author lw875
 * @create 2019-03-13 23:31
 */
@Data
@Accessors(chain = true)
public class Student {

    public final static String MALE = "男";

    public final static String FEMALE = "女";

    private String name;

    private Integer age;

    private String sex;

    private Integer stuId;

    private Integer classId;

    private Pet pet;

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
