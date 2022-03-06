package collection;

import java.util.*;

public class TreeSetComparator
{
    public static void main(String[] args)
    {
        TreeMap t1 = new TreeMap(new MyComparator());
        t1.put(4, 20);
        t1.put(3, 78);
        t1.put(1, 34);
        t1.put(2, 44);
        t1.put(8, 34);
        System.out.println(t1);


        ArrayList t = new ArrayList();
        t.add(10);
        t.add(15);
        t.add(0);
        t.add(23);
        t.add(2, 10);
        t.remove(2);
        t.add(26);
    for (int i = 0; i < t.size(); i++)
        {
            System.out.println(t.get(i));

        }
    }
}

    class MyComparator implements Comparator
    {
        public int compare(Object obj1, Object obj2)
        {
            Integer I1 = (Integer) obj1;
            Integer I2 = (Integer) obj2;
            if (I1 > I2)
                return -1;
            else if (I1 < I2)
                return +1;
            else
                return 0;
            //
        }

    }
