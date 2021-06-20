package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollection {
    public static void main(String[] args) {
        List l1 =new ArrayList<Object>();
        Integer a = 1;
        l1.add(a);
        System.out.println(l1);

        Set<Object> s = new HashSet<Object>();
        s.add(a);
        Integer b = 2;
        s.add(b);
        System.out.println(s);
    }
}
