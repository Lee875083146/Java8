package com.nopainanymore.java8.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author nopainanymore
 * @time 2019-03-31 10:07
 */
@Data
@Accessors(chain = true)
public class Pet {

    private String name;


}
