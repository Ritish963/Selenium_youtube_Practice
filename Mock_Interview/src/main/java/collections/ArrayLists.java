package collections;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(null);
        list.add(1);
        System.out.println(list.contains(2));
        list.remove(1);
        System.out.println(list);
    }
}
class Map1
{
    public static void main(String[] args) {
        HashMap<Integer,String> map =new HashMap<>();
        map.put(1,"ritish");
        map.putIfAbsent(1,"ritishbabu");
        map.put(2,"rupesh");
        map.put(0,"rakesh");
        map.put(null,"mani");
        map.putIfAbsent(null,"sorry");
        System.out.println(map);
        Set<Integer> set = map.keySet();
        Collection<String> values=map.values();
        System.out.println(set);
        System.out.println(values);
        System.out.println(map.get(2));


    }
}
