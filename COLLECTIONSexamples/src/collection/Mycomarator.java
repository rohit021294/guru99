package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Mycomarator{
    public static void main(String[] args)
    {
       //6. Check if a List of integers contains only odd numbers?
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(24);
        list.add(12);
        for (Integer list1:list)
        {
            if(list1%2==0)
            {
                System.out.println(list1);
            }

        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(5);
        list.add(10);
        list1.add(11);
        list1.add(20);
        list1.add(21);
        list1.add(24);
        list1.add(1);
        for (Integer listt:list1) {
            if(listt%2!=0)
            {
              System.out.println(listt+"is odd number");
            }
            else
                System.out.println(listt+"not a odd number");
        }

      System.out.println(checkPalindromeString("rohit"));

    }


   static boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();
        for(int i=0; i < length/2; i++) {
            if(input.charAt(i) != input.charAt(length-i-1)) {
                result = false;
                break;
            }
        }
        return result;
    }




}
