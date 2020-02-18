package edu.np.scst.inheritance.singleinheritance;

public class Child extends Parent{
    int money2 = 200;
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.money);
        System.out.println(c.money2);
        System.out.println(c.eye);
        c.car();
        Parent p = new Parent();
        System.out.println(p.money);
    }
}
