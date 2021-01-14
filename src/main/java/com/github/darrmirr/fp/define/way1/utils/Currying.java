package com.github.darrmirr.fp.define.way1.utils;

import java.util.function.Function;

/**
 * Utility interface to define currying functions
 */
public interface Currying {

    interface Of2<A, B, R> extends Function<A, Function<B, R>> {}
    interface Of3<A, B, C, R> extends Function<A, Function<B, Function<C, R>>> {}
}
