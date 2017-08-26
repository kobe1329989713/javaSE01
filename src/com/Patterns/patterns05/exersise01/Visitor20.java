package com.Patterns.patterns05.exersise01;



/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/19 23:35
 * <br/>

 *  访问者模式
 *      访问者模式就是一种分离对象数据结构与行为的方法，
 *      通过这种分离，
 *      可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 */
    interface Visitor {
        public void visit(Subject sub);
    }

    class MyVisitor implements Visitor {

        @Override
        public void visit(Subject sub) {
            System.out.println("visit the subject："+sub.getSubject());
        }
    }

    interface Subject {
        public void accept(Visitor visitor);
        public String getSubject();
    }

    class MySubject implements Subject {

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }

        @Override
        public String getSubject() {
            return "love";
        }
    }

    public class Visitor20 {
        public static void main(String[] args) {

            Visitor visitor = new MyVisitor();
            Subject sub = new MySubject();
            sub.accept(visitor);
        }
    }
