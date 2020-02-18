/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.np.scst.lab;

/**
 *
 * @author manish
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int a = 4, i, b = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                b++;
            }
        }
        if (b > 2) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }

}
