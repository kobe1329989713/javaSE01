package com.patterns.patterns01.exercise01.factory01;

/**
 *
 */
public class TestFruit {
    public static void main(String[] args) {
        try {
            IFruit f = FruitGandener.factory("Apple222");
            f.grow();
            FruitGandener.factory("Grape");
            FruitGandener.factory("Strawberry");
        } catch (BadFruitException e) {
            System.out.println(e.getMessage());
        }

    }
}
