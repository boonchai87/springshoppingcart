package basic;

import javax.persistence.Basic;

public class Basic2 {
    public static void main(String[] args) {
        String a = new String("dd");// create object in non pool
        String b= new String("dd");// create object in non pool
        String c="dd";
        String d="dd";
        Integer e=3;
        Integer f=3;
        Integer g=new Integer(3);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.equals(b));// compare value
        System.out.println(e==g);
        System.out.println(f==e);

        /*Basic2 o = new Basic2();
        Basic2 o2 = new Basic2();
        System.out.println(o.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o.equals(o2));*/
    }
}
