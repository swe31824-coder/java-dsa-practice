import java.util.HashMap;
public class HashMapDemo{
    public static void main(String[]args){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("1",10);
        map.put("2",40);
        map.put("3",90);
        System.out.println(map.size());
        System.out.println(map.get("1"));
    }
}
