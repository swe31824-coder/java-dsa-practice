import java.util.Scanner;
public class SortarrayInAscendingOrder{
    public static void main(String[]args){
    int[]arr={2,4,7,8,6,0,9};
    int n=arr.length;
     for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;            }
        }
     }
     for(int i=0;i<n;i++)
        System.out.print(arr [i]+" " );
    }
}