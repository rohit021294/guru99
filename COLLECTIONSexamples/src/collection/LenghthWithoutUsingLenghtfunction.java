package collection;

public class LenghthWithoutUsingLenghtfunction {
    public static void main(String[] args)
    {
        String string="rohit";
        String reverseString="";
        int count=0;
        for(char a: string.toCharArray())
        {
            count++;
        }
        for(int i=count-1;i>=0;i--)
        {
            reverseString=reverseString+string.charAt(i);
        }
    System.out.print(reverseString);
    }

}
