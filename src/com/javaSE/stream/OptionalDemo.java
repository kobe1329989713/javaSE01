package com.javaSE.stream;

import java.util.Optional;

/**
 * Optional 这个类 有点像 包装类，如：Integer 这些
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Person p = new Person(1,"Tom",4000D,null, Person.Gender.MALE);
        //Integer year = p.getBirthDate().getYear();
        //System.out.println(year);

        //Optional<String> o1 = Optional.of("Tom");
        Optional<String> o1 = Optional.ofNullable(null);
        System.out.println(o1.orElse("default"));
        if (o1.isPresent()){
            System.out.println(o1.get());
        }
    }
}
