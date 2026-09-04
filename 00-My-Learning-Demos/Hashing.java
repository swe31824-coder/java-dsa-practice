import java.util.HashMap;
import java.util.Scanner;
public class Hashing{
    public static void main(String[]args){
        HashMap<Integer,String>map=new HashMap <>();
    map.put(1,"swe");
    map.put(2,"keer");
    map.put(3,"srav");
    map.put(4,"sand");
    System.out.println(map);
    System.out.println(map.containsKey(3));
    System.out.println(map.size());
    }
}
