package collection;
import java.util.*;
import java.util.HashMap;
 class HashMapSorting {
        public static void main(String[] args) {
            HashMap<Integer, String> h = new HashMap<Integer, String>();
            h.put(10, "fklkdsjb");
            h.put(11, "jfjkhfdjh");
            h.put(15, "rahl");
            h.put(9, "rithik");
            h.put(8, "maurya");
            h.put(3,"almond");
            System.out.println(h);
            int[] array = {1, 2, 3, -1, -2, 4};

            Arrays.sort(array);


            System.out.println(Arrays.toString(array));
            System.out.println("Before Sorting:");
            Set set = h.entrySet();
            Iterator iterator = set.iterator();
            while(iterator.hasNext()) {
                Map.Entry pair = (Map.Entry)iterator.next();
                System.out.print(pair.getKey() + ": ");
                System.out.println(pair.getValue());
            }
            Map<Integer, String> map = new TreeMap<Integer, String>(h);
            System.out.println("After Sorting:");
            Set set2 = map.entrySet();
            Iterator iterator2 = set2.iterator();
            while(iterator2.hasNext()) {
                Map.Entry pair = (Map.Entry)iterator2.next();
                System.out.print(pair.getKey() + ": ");
                System.out.println(pair.getValue());
            }







        }
}