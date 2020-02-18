package edu.np.scst.lab;

public class Arrays {
    public static void main(String[] args) {
        float[] f =new float[10];
        for(int i=0;i<10;i++){
            
                f[i]=i+1;
        }
        for(float var:f){
            System.out.println(var);
        }
    }
}
