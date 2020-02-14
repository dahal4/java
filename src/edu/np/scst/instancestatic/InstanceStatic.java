/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.np.scst.instancestatic;

/**
 *
 * @author manish
 */
public class InstanceStatic {

    public void instance1() {
        instance2();//calling instance from instance
        System.out.println("Instance1");
    }

    public void instance2() {
        InstanceStatic.static1();//calling static from instance
        System.out.println("Instance2");
    }

    public static void static1() {
        System.out.println("static1");

    }
    public static void main(String[] args) {
        static1();//calling static from static
        InstanceStatic obj = new InstanceStatic();
        obj.instance1();//calling instance from static
    }
}
