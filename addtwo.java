public class addtwo{
    public static void main(String[]args){
        int[]arr={1,2,8,3,9,0};
        int sum=12;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Indices: " + i + ", " + j);
                    System.out.println("Values: " + arr[i] + ", " + arr[j]);
                }
            }
        }

    }
}