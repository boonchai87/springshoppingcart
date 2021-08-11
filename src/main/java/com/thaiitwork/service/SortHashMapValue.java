package com.thaiitwork.service;

import java.util.Collections;
        import java.util.Comparator;
        import java.util.HashMap;
        import java.util.Iterator;
        import java.util.LinkedHashMap;
        import java.util.LinkedList;
        import java.util.List;
        import java.util.Map;
        import java.util.Set;
public class SortHashMapValue
{
    public static void main(String[] args)
    {
//implementing HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("ab",10);
        hm.put("bc", 2);
        hm.put("ssss", 3);
        hm.put("1", 3);
        hm.put("xx", 4);
        hm.put("yy", 5);
        hm.put("yy", 7);
        System.out.println("Before Sorting:");
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry map = (Map.Entry)iterator.next();
            System.out.println("Roll no:  "+map.getKey()+"     Name:   "+map.getValue());
        }
        Map<Integer, String> map = sortKey(hm,false);
        System.out.println("\n");
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext())
        {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.println("Roll no:  "+me2.getKey()+"     Name:   "+me2.getValue());
        }
    }
    //method to sort values
    private static HashMap sortKey(HashMap map,boolean isAsc)
    {
        List list = new LinkedList(map.entrySet());
        System.out.println(list);
        //Custom Comparator
        Collections.sort(list, new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                //Object key1 = ((Map.Entry) (o1)).getKey();
                //Object key2 = ((Map.Entry) (o2)).getKey();
                Integer key1 = ((String)((Map.Entry) (o1)).getKey()).length();
                Integer key2 = ((String)((Map.Entry) (o2)).getKey()).length();
                if( isAsc )
                    return ((Comparable)key1).compareTo(key2);
                else
                    return ((Comparable)key2).compareTo(key1);
            }
        });
        //copying the sorted list in HashMap to preserve the iteration order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();)
        {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

    private static HashMap sortByValues(HashMap map,boolean isAsc) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                if( isAsc )
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
                else
                    return ((Comparable) ((Map.Entry) (o2)).getValue())
                            .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
