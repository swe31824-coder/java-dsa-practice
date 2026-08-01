import java.util.Scanner;
public class MaximumElement {
    public static void main(String[]args){
        int[]arr={2,3,1,4,9,6,7};
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
                if(max<arr[i]){
                max=arr[i]; 
                }             
            }
            System.out.println("Maximum element =" +max);
        }
    }
    

