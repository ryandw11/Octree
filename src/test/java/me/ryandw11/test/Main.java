package me.ryandw11.test;
import me.ryandw11.octree.Octree;

public class Main {

    public static void main(String[] args){
        Octree<String> tree = new Octree<>(-7, -7, -7, 5, 5, 5);
        tree.insert(1, 2, 3, "This is a test");
        tree.insert(-4, -4, -4, "Test 2");
        tree.insert(-1, -1, -1, "test3");
        tree.insert(-3, -3, -4, "Test 5");

        System.out.println(tree.find(-1, -1, -1));
        System.out.println(tree.get(-3, -3, -4));
        System.out.println(tree.get(-1, -1, -1));

        String s = tree.get(-1, -1, 1);

        tree.remove(-1, -1, -1);
        System.out.println(tree.find(-1, -1, -1));
    }
}
