/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.np.scst.constructors;

/**
 *
 * @author manish
 */
public class Mobile {
    Mobile(){
        this(10);
        System.out.println("Hello");
    }
    Mobile(int i){
        System.out.println("hello again:"+i);
    }
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
    }
}
