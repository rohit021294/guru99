package javaaaa;

import java.util.*;

public class ArrayBothContainingSameElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 7};
        int lenghtArr = arr.length;
        int lenghtArr1 = arr1.length;
        if (lenghtArr == lenghtArr1) {
            //System.out.println("same element");
        } else {
           // System.out.println("diffferent elements");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
       // System.out.println(sum);



        List l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        List l2=new ArrayList();
        l2.add(3);
        l2.add(2);
        l2.add(2);
        List mergerdList=new ArrayList(l);
        mergerdList.addAll(l2);
       // System.out.println(mergerdList);

        HashMap h=new HashMap();
        h.put(103,"rohit");
        h.put(105,"maurya");
        h.put(101,"haha");
        Map m=new TreeMap(h);
        Set set=m.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext())
        {Map.Entry pair=(Map.Entry) it.next();
            System.out.print(pair.getKey()+" ");
            System.out.println(pair.getValue());
        }












    }
}
