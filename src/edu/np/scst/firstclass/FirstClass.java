/**
 * Java documentation
 */
// single Line comment
/*
Multiline comment
*/
package edu.np.scst.firstclass;

public class FirstClass {
    public static void main(String[] args) {
        int i = 10;
        i = (++i) + i; // pre incerement
        System.out.println(i);
        int j = 10;
        j= (j++) + j; // post incerement
        System.out.println(j);
    }
}
