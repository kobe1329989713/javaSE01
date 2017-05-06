package com.javaSE.stream;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 各种创建 Stream 的方式。
 */
public class StreamDemo02 {
    public static void main(String[] args) {
        // 方式一。
        Stream<String> s1 = Stream.of("Tom", "Jack", "Rose", "Tim");

        // 方式二。
        Stream<String> s2 = Stream.<String>builder().add("Jack").add("Tom").build();

        // 方式三。
        IntStream i1 = IntStream.range(1, 6);
        i1.forEach(System.out::println);

        //
        System.out.println("-------它就会包含 6 -------");
        IntStream i2 = IntStream.rangeClosed(1, 6);
        i2.forEach(System.out::println);
        // 其它还有 double 类型 Long 这些类型的。


        // 创建一个空的 Stream
        Stream<String> s3 = Stream.empty();
        IntStream s4 = IntStream.empty();

        // 用函数 来创建 一个 Stream
        System.out.println("---------------");
        Stream<Long> l1 = Stream.iterate(1L, n -> n + 1);
        l1.limit(10).forEach(System.out::println);


        // 输出一个随机数。
        Stream.generate(Math::random).limit(5).forEach(System.out::println);


        // 通过数组来产生Stream
        Arrays.stream(new int[]{1,2,3,4,5});
        Arrays.stream(new String[]{"1","2","3","4","5"});

        // 集合来产生 Stream

        // 其它方式来产生 Stream
        System.out.println("-----其它方式来产生 Stream-------");
        "aaaabbb".chars().forEach(System.out::println);


        System.out.println("----------");
        Pattern.compile(",").splitAsStream("abc,cde,fgr").forEach(System.out::println);












    }
}
