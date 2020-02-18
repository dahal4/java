/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.np.scst.inheritance.hierarchicalinheritancce;

/**
 *
 * @author manish
 */
public class Child2 extends Parent {
    int moneyC2=300;
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        System.out.println(c1.moneyC1);
        System.out.println(c2.moneyC2);
        Parent p = new Child1();
        System.out.println(p.money);

        
    }
}
