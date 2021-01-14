package com.github.darrmirr.fp.define.way1;

import com.github.darrmirr.fp.define.way1.utils.Functions;

import static com.github.darrmirr.fp.define.way1.utils.Functions.def;

/**
 * Example 2:
 *
 *     `def` method for currying function with two arguments
 *
 */
public interface Main2 {

    static void main(String[] args) {
        var sum1 = Functions.def((Integer x) -> x + x);
        var sum2 = Functions.def((Integer x) -> (Integer y) -> x + y);

        System.out.println("sum 1 : " + sum1.apply(1));
        System.out.println("sum 2 : " + sum2.apply(1).apply(2));
    }
}
