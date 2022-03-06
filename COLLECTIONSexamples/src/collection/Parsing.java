package collection;
public class Parsing {
    public static void main(String[] args)
    {
//        String str="jdyih@ydiuweyyy^yewuyuifryufjhegyet%ddgsjfgweyufvfhj!fggfewfj*frhufryuy";
//        String s[]=str.split("@");
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//

//        int nextTerm;
//        int a=0,b=1;
//        System.out.print(a+","+b+",");
//
//        do {
//            nextTerm=a+b;
//            a=b;
//            b=nextTerm;
//            System.out.print(nextTerm+",");
//        }while (nextTerm<100);

   String s1="Baba baba black sheep black as his mouth baba mouth sheep baba huhuu black";
   String s2=s1.toLowerCase();
   String s3[]=s2.split( " ");
   System.out.println(s2);
   int count;
for(int i=0;i<s3.length;i++)
{
    count=1;
    for(int j=i+1;j<s3.length;j++)
    {
        if(s3[i].equals(s3[j]))
        {
            count++;
            s3[j]="0";
        }
    }
    if(count>1 && s3[i]!="0")
    {System.out.println(s3[i]+" occured "+count+"  times");
    }
    else if(count==1 && s3[i]!="0")
    {
        System.out.println(s3[i]+" occured "+count+" times");
    }
}
String s4="Mynameisrohit";
s4=s4.toLowerCase();
String s5="";
for(int i=0;i<s4.length();i++)
{
    s5=s4.charAt(i)+s5;
}
System.out.println(s5);







    }
}
