package javaaaa;

public class RemoveSpaces {
    public static void main(String[] args)
    {
        String s="My name is rohit";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            {
                continue;
            }
            else
                s1=s1+c;
        }
        System.out.println(s1);





    }
}
