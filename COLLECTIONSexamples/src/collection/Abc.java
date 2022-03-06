package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Abc {
    //HAshMap sorting according to keys

    public static void main(String[] args) {
        HashMap h=new HashMap();
        h.put(101,"rohit");
        h.put(105,"tamil");
        h.put(102,"java");
        h.put(106,"ghgfg");
        h.put(109,"hcfgxg");
        h.put(107,"lkhgdd");
        System.out.println(h.put(105,"pallindrome"));
        Set set= h.entrySet();
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            Map.Entry pair=(Map.Entry) it.next();
            System.out.println(pair.getValue());
            System.out.println(pair.getKey());
        }

    }
}
