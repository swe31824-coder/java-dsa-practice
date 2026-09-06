
public class MovingZerosToEndOfArray{
    public static void main(String[]args){
        int[]arr={2,0,4,8,0,9,0,0,4};
        int n=arr.length;
        int[]temp=new int[n];
        int nz=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[nz++]=arr[i];
            }
        }
        for(int i=0;i<nz;i++){
            arr[i]=temp[i];
        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
