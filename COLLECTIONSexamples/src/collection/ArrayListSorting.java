package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(50);
        a.add(30);
        a.add(40);
        Comparator comparator= Collections.reverseOrder();
        Collections.sort(a);
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        Collections.sort(a,Collections.reverseOrder());
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }






    }

}
