import java.util.Scanner;
public class LeftRotateArrayByDPlaces{
    public static void main(String[]args){
        int[]arr={7,8,9,4,5,6};
        int d=3;
        int i;
        int n=arr.length;
        int[] temp=new int[d];
        for(i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for ( i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
