package com.github.darrmirr.fp.define.way1;

import static com.github.darrmirr.fp.define.way1.utils.Functions.def;

/**
 * Example 1:
 *
 *     `def` method for currying function with one argument
 *
 */
public interface Main1 {

    static void main(String[] args) {
        var sum1 = def((Integer x) -> x + x);

        System.out.println("sum 1 : " + sum1.apply(1));
    }
}
