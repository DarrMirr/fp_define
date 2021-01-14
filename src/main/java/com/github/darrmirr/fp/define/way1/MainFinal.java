package com.github.darrmirr.fp.define.way1;

import com.github.darrmirr.fp.define.way1.utils.Functions;

import static com.github.darrmirr.fp.define.way1.utils.Functions.def;

/**
 * Final example:
 *
 *     using single method `def` name
 *
 */
public interface MainFinal {

    static void main(String[] args) {
        System.out.print("start init sum1 ");
        var sum1 = Functions.def((Integer x) -> x + x);

        System.out.print("start init sum2 ");
        var sum2 = Functions.def((Integer x) -> (Integer y) -> x + y);

        System.out.print("start init sum3 ");
        var sum3 = def((Integer x) -> (Integer y) -> def((Integer z) -> x + y + z));

        System.out.println("sum 1 : " + sum1.apply(1));
        System.out.println("sum 2 : " + sum2.apply(1).apply(2));
        System.out.println("sum 3 : " + sum3.apply(1).apply(2).apply(3));
    }
}
