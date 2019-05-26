
import java.util.ArrayList;

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
        // TODO code application logic here
        int[] list = {1,3,5,7,1,2,4,6,2,4,6};
        int[] list1 = {1,3,5,7,1,2,4,6,2,4,6};
        int[] list2 = {1,3,5,7,1,2,4,6,2,4,6};
        int n = list.length;
        int n1 = list1.length;
        int n2 = list2.length;
        boolean swapped;
        for(int i = 0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-1;j++)
            {
                if(list[j]<list[j+1]){
                    int temp = list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
        
        for(int i=1;i<n1;i++)
        {
            int position = i;
            int value = list1[i];
            while( position>0 && list1[position-1]>value ){
                list1[position] = list1[position-1];
                position--;
            }
            list1[position] = value;
        }
        
        for(int i = 0; i<n2;i++)
        {
            int index = i;
            int max = list2[i];
            for(int j = i; j<n2; j++)
            {
                if(max<list2[j]){
                    max=list2[j];
                    index = j;
                }
            }
            if(index!=i && max!=list2[i]){
                int temp = list2[i];
                list2[i] = list2[index];
                list2[index] = temp;
            }
        }
        for(int i = 0;i<n;i++)
        System.out.print(list[i]+ " ");
        
        System.out.println();
        
        for(int i = 0;i<n1;i++)
        System.out.print(list1[i]+ " ");
        
        System.out.println();
        for(int i = 0;i<n2;i++)
        System.out.print(list2[i]+ " ");
    }
    
    
}
