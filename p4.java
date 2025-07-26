package prac;

import java.util.ArrayList;

public class p4 {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(10);  // Boxing or cached object creation
        int x = obj;  // Unboxing

        System.out.println("object creation/cached object: " + obj);
        System.out.println("unboxing: " + x);
    }
}