package com.nopainanymore.java8.practice;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * java8: PassByValue
 *
 * @author nopainanymore
 * @version 2019-11-10 14:28
 */
@Slf4j
public class PassByValue {

    private static Gson gson = new Gson();

    @Data
    @AllArgsConstructor
    static class Value {
        Integer num;
    }

    private static void change(Value value) {
        log.info("PassByValue- change- value:{}, identityHashCode:{}", gson.toJson(value), System.identityHashCode(value));
        value.num = 233;
        log.info("PassByValue- change- value:{}, identityHashCode:{}", gson.toJson(value), System.identityHashCode(value));
    }


    private static void change(int num) {
        log.info("PassByValue- change- num:{}", num);
        num = 1;
        log.info("PassByValue- change- num:{}", num);
    }

    public static void main(String[] args) {
        int num = 233;
        log.info("PassByValue- main- before num:{}", num);
        change(num);
        log.info("PassByValue- main- after num:{}", num);

        Value origin = new Value(1);
        log.info("PassByValue- main- before value:{} identityHashCode:{}", gson.toJson(origin), System.identityHashCode(origin));
        change(origin);
        log.info("PassByValue- main- after value:{} identityHashCode:{}", gson.toJson(origin), System.identityHashCode(origin));
    }

}
