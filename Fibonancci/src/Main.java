/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nam NV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static long fibonacci(int n){
         if(n <= 1) return n;
         else return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i = 1;i<=n;i++){
            System.out.println(i+": " +fibonacci(i));
        }
    }
    
}
