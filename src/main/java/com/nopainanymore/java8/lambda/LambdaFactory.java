package com.nopainanymore.java8.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * java8: LambdaFactory
 *
 * @author nopainanymore
 * @version 2020-02-17 20:38
 */
public class LambdaFactory {

    static abstract class Product {
        public Product() {
        }
    }

    static class Loan extends Product {
        public Loan() {
        }
    }

    static class Stock extends Product {
        public Stock() {
        }
    }

    static class Bond extends Product {
        public Bond() {
        }
    }

    private final static Map<String, Supplier<Product>> factoryMap = new HashMap<>();

    private static final String LOAN = "loan";

    private static final String STOCK = "stock";

    private static final String BOND = "bond";

    static {
        factoryMap.put(LOAN, Loan::new);
        factoryMap.put(STOCK, Stock::new);
        factoryMap.put(BOND, Bond::new);
    }

    public static Product createProduct(String name) {
        Supplier<Product> productSupplier = factoryMap.get(name);
        if (productSupplier != null) {
            return productSupplier.get();
        }
        throw new IllegalArgumentException("product not define");
    }
}
