package edu.np.scst.thissuperkeyword;

public class Parent {
    int parentProperty = 200;
    Parent() {
        System.out.println("Parent constructor");
    }
    Parent(int i){
        this();
        System.out.println("parent argument construtor"+i);
    }
    public static void main(String[] args) {
        
    }
}
