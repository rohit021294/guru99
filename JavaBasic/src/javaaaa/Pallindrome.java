package javaaaa;

public class Pallindrome {
    public static void main(String[] args)
    {

        String str="naman";
        String s=" ";
        for(int i=str.length()-1;i>=0;i--)
        {
    s=s+str.charAt(i);
        }
        System.out.println(s);
        System.out.println(s.equals(str));
        if(str.equals(s))
        {
            System.out.println("not pallindrome");
        }
        System.out.println(str.concat("rohit"));
        String words[]=str.split("t");
       for(int i=0;i< words.length;i++)
       {
           System.out.println(words[i]);
       }








    }
}
