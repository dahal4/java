package edu.np.scst.arraydemo;

public class Arrays {

    //psvm + TAB
    public static void main(String[] args) {
        int[] i = new int[5];//preferable
        int j[] = new int[5];
        boolean[] b = new boolean[5];
        int[] k = {1, 1, 2, 3};
        for (int counter = 0; counter < i.length; counter++) {
            //sout  + TAB
            System.out.println(i[counter]);
        }
        //for(arraytype variable: arrauyname)
        for (boolean var : b) {//for each loop
            System.out.println(var);
        }
    }

}
