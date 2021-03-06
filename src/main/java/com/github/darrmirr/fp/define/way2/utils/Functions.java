package com.github.darrmirr.fp.define.way2.utils;

import java.util.function.Function;

/**
 * Utility interface that helps define lambdas expression at expressive and short way
 *
 */
public interface Functions {

    /**
     * Define function with one argument
     *
     * @param function to define
     * @param <A> function's input type
     * @param <R> function's output type
     * @return function that is passed to method
     */
    static <A, R> Function<A, R> def1(Function<A, R> function) {
        System.out.println("at def of 1");
        return function;
    }

    /**
     * Define function with two arguments
     *
     * @param function to define
     * @param <A> function's first input type
     * @param <B> function's second input type
     * @param <R> function's output type
     * @return function that is passed to method
     */
    static <A, B, R> Function<A, Function<B, R>> def2(Function<A, Function<B, R>> function) {
        System.out.println("at def of 2");
        return function;
    }

    /**
     * Define function with three arguments
     *
     * @param function to define
     * @param <A> function's first input type
     * @param <B> function's second input type
     * @param <C> function's third input type
     * @param <R> function's output type
     * @return function that is passed to method
     */
    static <A, B, C, R> Function<A, Function<B, Function<C, R>>> def3(Function<A, Function<B, Function<C, R>>> function) {
        System.out.println("at def of 3");
        return function;
    }
}
