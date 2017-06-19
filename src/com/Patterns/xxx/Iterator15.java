package com.Patterns.xxx;



/**
 * <br/>Author:Kobe
 * <br/>Date:2017/6/19 22:22
 * <br/>
 * Iterator：
 * <p>
 * 迭代子模式：
 *      就是有顺序访问聚集中的对象
 */
// 两个接口
interface Collection {
    public Iterator2 iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
interface Iterator2 {
    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}

// 两个实现
class MyCollection implements Collection {

    public String string[] = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator2 iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}

class MyIterator implements Iterator2 {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}

public class Iterator15 {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator2 it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
