public class LinearSearch{
    public static void main(String[]args){
        int[]arr={1,4,6,7,8,9};
        int n=arr.length;
        int target=9;
        for(int i=0;i<n;i++){
            if(arr[i]==target)
            {
                System.out.println("Index: " + i);
                System.out.println("Value: " + arr[i]);
            }
        }
    }
}
