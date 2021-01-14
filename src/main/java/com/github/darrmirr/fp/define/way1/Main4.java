package com.github.darrmirr.fp.define.way1;

import static com.github.darrmirr.fp.define.way1.utils.Functions.def;

/**
 * Example 4:
 *
 *     `def` method for currying function with three arguments
 */
public interface Main4 {

    static void main(String[] args) {
        var sum1 = def((Integer x) -> x + x);
        var sum2 = def((Integer x) -> (Integer y) -> x + y);
        var sum3 = def((Integer x) -> (Integer y) -> def((Integer z) -> x + y + z));

        System.out.println("sum 1 : " + sum1.apply(1));
        System.out.println("sum 2 : " + sum2.apply(1).apply(2));
        System.out.println("sum 3 : " + sum3.apply(1).apply(2).apply(3));
    }
}
