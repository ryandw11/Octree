package me.ryandw11.test;
import me.ryandw11.octree.Octree;

public class Main {

    public static void main(String[] args){
        Octree<String> tree = new Octree<>(0,0,0, 16, 16, 16);

        tree.insert(15, 14, 12, "test");
    }
}
