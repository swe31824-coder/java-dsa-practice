public class SortArray{
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("arr[j]");
    }

}