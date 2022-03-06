package stringPrograms;

public class Duplicates {
    public static void main(String[] args)
    {
        String string = "Big black bug bit a big black dog on his big black nose";
        int count;
        string=string.toLowerCase();
        String str[]=string.split(" ");
        for(int i=0;i< str.length;i++)
        {
            count=1;
            for(int j=i+1;j< str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    count++;
                    str[j]="0";
                }
            }
            if(count>1 && str[i]!="0") {
                System.out.println("count of " + str[i] + " is " + count);
            }
            else if(count==1 && str[i]!="0")
                System.out.println("count of "+str[i]+" is "+count);
        }
    }


}
