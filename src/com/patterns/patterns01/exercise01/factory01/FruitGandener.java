package com.patterns.patterns01.exercise01.factory01;

/**
 * 工厂，
 */
public class FruitGandener {

    public static IFruit factory(String params) throws BadFruitException {
        if(params.equalsIgnoreCase("Apple")){
            return new Apple();
        }else if(params.equalsIgnoreCase("Grape")){
            return new Grape();
        }else if(params.equalsIgnoreCase("Strawberry")){
            return new Strawberry();
        }else {
            throw  new BadFruitException("no fount");
        }
    }

}
