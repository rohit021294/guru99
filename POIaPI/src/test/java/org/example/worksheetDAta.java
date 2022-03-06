package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class worksheetDAta {
    public static void main(String[] args) throws IOException {
        DAataDrivern data=new DAataDrivern();
        ArrayList<String> datas=data.getData("slaray");

        for (String a:datas) {
            System.out.println(a);
        }
    }
}
