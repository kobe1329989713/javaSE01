package com.patterns.patterns08.composite;

import java.util.Vector;

/**
 * Created by kobe on 2017/8/17.19:39
 * <br/>
 * Description:
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");

        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

//        TreeNode nodeE = new TreeNode("E");
//        nodeB.add(nodeE);

        tree.root.add(nodeB); // 把 b 当成 根。
        nodeB.add(nodeC); // 添加的子节点。
        System.out.println("----把树建成！----");


//        System.out.println("节点名称。：" + nodeB.getName());
//        System.out.println("节点的 父节点。：" + nodeB.getParent());

        Vector<TreeNode> ts = nodeB.getChildren();
        for (TreeNode t : ts) {
            System.out.println("节点 有哪些子节点。：" + t.getName());
            System.out.println(t.getParent());
        }

    }
}
