package com.nopainanymore.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * java8: LambdaExceptionExample
 *
 * @author NoPainAnymore
 * @date 2019-05-13 21:53
 */
public class LambdaExceptionExample {

    public static void main(String[] args) throws ClassNotFoundException {

        List<String> clazzNameList = new ArrayList<>();
        clazzNameList.add("class0");
        clazzNameList.add("class1");

//        List<? extends Class<?>> collect = clazzNameList.stream().map(clazz -> Class.forName(clazz)).collect(Collectors.toList());

        List<? extends Class<?>> collect1 = clazzNameList.stream().map(LambdaExceptionUtil.rethrowFunction(clazz -> Class.forName(clazz))).collect(Collectors.toList());


    }
}
