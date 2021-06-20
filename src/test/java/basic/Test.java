package basic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(-1);
        list.add(-5);
        list.add(0);
        list.add(5);

        List<Integer> sortList =new ArrayList<Integer>();
        int min =list.get(0);
        for(int j=0;j<list.size();j++) {
            int removeIndex =0;
            for (int i = 0; i < list.size(); i++) {
                if (min > list.get(i)) {
                    min = list.get(i);
                    removeIndex =i;
                }
            }
            System.out.println(min);
            //min = list.get(removeIndex);
            sortList.add(min);
            list.remove(removeIndex);
            System.out.println(list);
            min = list.get(0);
        }
        System.out.println("sort"+sortList);
    }
}
