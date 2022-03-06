package org.example;

import org.testng.annotations.Test;

public class ApiPoJOClass {


    private String rohit;
    private String uv;

    public static void main(String[] args) {
        String b="";
        String s = "rohit rahul rithik ronit";
        String[] r = s.split(" ");
        for (String a:r) {
            b=" "+a+b;

        }
        System.out.println(b);

    String str1="abcd";
    String str2="efgh";
    String str3="ijkl";
    str1=str1.concat(str2);
    str1=str1.concat(str3);
    System.out.println(str1);










    }
}