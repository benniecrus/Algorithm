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
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int upperPoint = a.length;
        int lowerPoint = 1;
        int x = 3;
        int index = 0;
        boolean found = false;
        
        while( found == false ){
            if(lowerPoint > upperPoint)
                break;
            
            index = lowerPoint + (lowerPoint + upperPoint)/2;
            if(a[index] < x)
                lowerPoint = index+1;
            if(a[index] > x)
                upperPoint = index-1;
            if(a[index] == x)
            {found = true;
            break;
            }
        }
        System.out.println(index);
        
    }
    
}
