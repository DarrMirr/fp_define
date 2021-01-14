package com.github.darrmirr.fp.define.way2;

import static com.github.darrmirr.fp.define.way2.utils.Functions.*;

/**
 * Final example:
 *
 *     using different method `def` names
 *
 */
public interface MainFinal {

    static void main(String[] args) {
        System.out.print("start init sum1 ");
        var sum1 = def1((Integer x) -> x + x);

        System.out.print("start init sum2 ");
        var sum2 = def2((Integer x) -> (Integer y) -> x + y);

        System.out.print("start init sum3 ");
        var sum3 = def3((Integer x) -> (Integer y) -> (Integer z) -> x + y + z);

        System.out.println("sum 1 : " + sum1.apply(1));
        System.out.println("sum 2 : " + sum2.apply(1).apply(2));
        System.out.println("sum 3 : " + sum3.apply(1).apply(2).apply(3));
    }
}
