package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayLargestEleement {
    public static void main(String[] args)
    {
     int[] arr=new int[]{1,5,2,8,4,1,3};
        Arrays.sort(arr);
        System.out.println("smallest element   :"+arr[0]);
//        int length=arr.length;
//        System.out.println("largest element :"+arr[length-1]);
     int value=arr[0];
     for(int i=0;i<arr.length;i++)
     {
         if(value<arr[i])
         {
             System.out.println("second larggest element    :"+arr[i]);
             break;
         }
     }




    }
}
