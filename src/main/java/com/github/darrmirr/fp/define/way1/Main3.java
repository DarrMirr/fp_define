package com.github.darrmirr.fp.define.way1;

import com.github.darrmirr.fp.define.way1.utils.Functions;

import static com.github.darrmirr.fp.define.way1.utils.Functions.def;

/**
 * Example 3:
 *
 *     `def` method for currying function with three arguments
 *     there is compiler error here, therefore illegal code is commented
 */
public interface Main3 {

    static void main(String[] args) {
        var sum1 = Functions.def((Integer x) -> x + x);
        var sum2 = Functions.def((Integer x) -> (Integer y) -> x + y);
//        var sum3 = def((Integer x) -> (Integer y) -> (Integer z) -> x + y + z);

        System.out.println("sum 1 : " + sum1.apply(1));
        System.out.println("sum 2 : " + sum2.apply(1).apply(2));
//        System.out.println("sum 3 : " + sum3.apply(1).apply(2).apply(3));
    }
}
