package javaaaa;

import java.util.ArrayList;

public class ArrayFrequency {
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        int[] arr=new int[]{2,3,4,3,5,6,2,4,2,4,6,8,1};
        for(int i=0;i< arr.length;i++)
        {
            a.add(arr[i]);
        }
        for(int i=0;i<a.size();i++)
        {
            int count=1;
            for(int j=i+1;j<a.size();j++)
            {
                if(a.get(i)== a.get(j))
                {
                    count++;
                    a.remove(j);

                }
            }
            System.out.println("frequency of the element "+a.get(i)+"is :"+count);
        }












    }
}
