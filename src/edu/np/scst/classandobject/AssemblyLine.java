/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.np.scst.classandobject;

/**
 *
 * @author manish
 */
public class AssemblyLine {
    public static void main(String[] args) {
        Mobile redmi = new Mobile();
        redmi.modelNo="xys";
        redmi.ram=(float)4.5;
        System.out.println("ram:"+redmi.ram);
        System.out.println("Model No:"+redmi.modelNo);
        System.out.println("Wifi Available:"+redmi.isWifi);
        System.out.println("A mobile is made");

    }
}
