/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_3_2025;

/**
 *
 * @author ADMIN
 */
public class Main {

//    static void nhiphan(int n){
//        if(n <= 0);
//        else{
//            nhiphan(n/2);
//            System.out.print(n%2);
//        }
//    }
    
    static void hanoi(int n, String A, String B, String C){
        if (n==1)
            System.out.println("Chuyen 1 dia tu " + A + " sang " + C);
        else{
            hanoi(n-1,A,B,C); hanoi(1,A,B,C); hanoi(n-1,B,A,C);
        }
    }
    
    public static void main(String[] args) {
//        int k = 139;
//        System.out.println("Bieu dien nhi phan cua " + k + ":"); nhiphan(k);
        
        int n=4; hanoi(n,"A","B","C");
    }
    
}
