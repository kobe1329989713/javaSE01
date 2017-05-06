package com.javaSE.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 */
public class StreamDemo03 {
    public static void main(String[] args) {
        // 奇数相加。
        Integer num = Stream.of(1, 2, 3, 4, 5).peek(n -> System.out.println(n)).filter(n -> n % 2 == 1).peek(n -> System.out.println(n)).reduce(0,Integer::sum);

        System.out.println(num);



        //Person.peoples().stream().forEach(p -> System.out.println(p.getName()));
        //Person.peoples().stream().forEach(System.out::println);


        Person.peoples().stream().map(Person::getName).forEach(System.out::println);


        IntStream.range(1,5).map(n->n*n).forEach(System.out::println);



        Person.peoples().stream().filter(Person::isMale).map(Person::getName).forEach(System.out::println);

















    }
}
