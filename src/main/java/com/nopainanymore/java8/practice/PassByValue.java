package com.nopainanymore.java8.practice;

import lombok.extern.slf4j.Slf4j;

/**
 * java8: PassByValue
 *
 * @author nopainanymore
 * @version 2019-11-10 14:28
 */
@Slf4j
public class PassByValue {

    private static void change(int num) {
        log.info("POne- change- {}", System.identityHashCode(num));
        num = 1;
        log.info("POne- change- {}", System.identityHashCode(num));
    }

    public static void main(String[] args) {
        int num = 233;
        change(num);
        log.info("PassByValue- main- {}", System.identityHashCode(num));
    }

}
