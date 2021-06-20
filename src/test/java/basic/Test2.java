package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);


        List<Integer> sortList =new ArrayList<Integer>();
        // find min
        int min =0;
        int minIndex = 0;
        for(int j=0;j<list.size();j++ ) {
            for (int i = 0; i < list.size(); i++) {
                if ( min < list.get(i) ) {
                    min = list.get(i);
                }
            }
            sortList.add(min);
        }
        System.out.println(min);
        /*
        // find max
        int max =0;
        for(int i=0;i<list.size();i++){
            if( max < list.get(i) ) {
                max = list.get(i);
            }
        }
        System.out.println(max);
        for(int i=0;i<list.size();i++){
            if( i!=minIndex && i!=maxIndex &&   ){
                sortList.add(list.get(i));
            }
        }
        sortList.add(max);*/

    }
}
