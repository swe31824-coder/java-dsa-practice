
import java.util.HashMap;
public class ContainsDuplicateHashing {
    public static void main(String[]args){
        HashMap<Integer,Integer>map=new HashMap<>();
        int []nums={2,4,2,5,6,7};
        int target=4;
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                System.out.println("[" +map.get(complement)+" ,"+i+"]");
            }
            map.put(nums[i],i);
        }
    }
}
