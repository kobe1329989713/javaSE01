package com.Patterns.patterns04;

import java.util.Enumeration;
import java.util.Vector;

/**
 * <br/> author：Kobe
 * <br/> date：2017/6/16 0016
 * <br/> time：14:36
 * <br/> now：星期五
 * <br/> description：<br/>
 *
 * 组合模式：
 *      组合模式有时又叫  部分-整体模式，
 *      在处理类似树形结构的问题时比较方便。
 */
class TreeNode{
    private String name; // 节点名
    private TreeNode parent; // 父节点
    private Vector<TreeNode> children = new Vector<>(); // 子节点。

    //添加孩子节点
    public void add(TreeNode node){
        children.add(node);
    }
    //删除孩子节点
    public void remove(TreeNode node){
        children.remove(node);
    }
    //取得孩子节点
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }

    public TreeNode() {}
    public TreeNode(String name) {
        this.name = name;
    }

    // getXxx() setXxx()
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TreeNode getParent() {
        return parent;
    }
    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }
}

//  Test
class Tree{
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("= 构建树完成 =");
    }
}

public class Composite10 {
}
