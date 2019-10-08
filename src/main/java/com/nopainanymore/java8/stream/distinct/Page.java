package com.nopainanymore.java8.stream.distinct;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * java8: Page
 *
 * @author nopainanymore
 * @version 2019-10-08 20:01
 */
@Getter
@Setter
public class Page {

    private Long id;

    private String pageKey;

    private String pageType;

    private String pageName;

    private String pageURL;

    private String owner;

    private String ownerName;

    private int totalPages;

    private String appName;

    private String productCode;

    private int orderNum;

    private String client;

    private String type;

    private String clientTypeDisplayName;

    private String operatingType;

    private Integer isPrefixMatching;

    private String responsible;

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

}

