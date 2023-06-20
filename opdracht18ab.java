/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoofdstuk5;

/**
 *
 * @author Dell
 */
public class opdracht18ab {

    public static void main(String[] args) {
        // TODO code application logic here
        //figuur 1
        //for (int i=1; i<6;i++){
        //if(i==1)System.out.println("*");
        //if(i>1)System.out.println("*");
        //figuur 2
        //for (int i=1; i<6; i++){
        //for (int j=0; j<i; j++){
        //System.out.print("*");
        //}
        //System.out.println();
        //figuur 3
        //for (int i = 5; i > 0; i--) {
        //for (int j = 0; j < i; j++) {
        //System.out.print("*");
        //}
        //System.out.println();
        //figuur 4
        for (int n = 1; n <= 6; n++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(n);
            }
            System.out.println();
        }
        //figuur 5
        //for (int i=1; i<6; i++){
        //for (int j=0; j<i; j++) {
        //System.out.print(i);
        //}
        //System.out.println();
        //figuur 6
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(6 - i);
            }
            System.out.println();
        }
    }
}
