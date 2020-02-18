package edu.np.scst.thissuperkeyword;

public class Child extends Parent{
    int childProperty = 100;
    //Child(){} default constructor
    //Default constructor only created when no other constructor are manually created
    Child() { //Argumentless constructur
        this(59);
        System.out.println("argumentless constructor");
        System.out.println(this.childProperty);
        System.out.println(super.parentProperty);
    }
    Child(int i){//argument constructor
        super(35);
        System.out.println("argument constructor"+i);
    }
    public static void main(String[] args) {
        Child c = new Child();
        
    }
}
