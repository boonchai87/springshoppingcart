package com.thaiitwork.service;

import java.util.*;
import java.util.stream.Collectors;

class Test2 {
    public static void main (String[] args) {
       String str = "abababababab";
       //System.out.println(str.length());
        HashMap hm = new HashMap<String,Integer>();
       for(int len=2;len<=str.length();len++){//2-14
           for(int j=0;j<str.length();j++) {
               if (j + len <= str.length()) {
                  // System.out.println(str.substring(j, j + len));
                   String key = str.substring(j, j + len);
                   if( hm.containsKey(key) ){
                       hm.put(key,((int)hm.get(key))+1);
                   }else{
                       hm.put(key,1);
                   }
               }
           }
       }

       System.out.println(hm);

        //Map<Integer, String> sortedMap = sortByKeys(hm,false);
        //System.out.println(sortedMap);
        Map<Integer,String> sortedMap2 = sortByValues(hm,false);
        System.out.println(sortedMap2);

        Set keys = sortedMap2.keySet();
        String result = "-1";
        int max =0;
        int frequency =0;
        Iterator<String> it = keys.iterator();
        Iterator<String> it2 = keys.iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            int f = (int)hm.get(key);
            if( f > 1  ){
                while(it2.hasNext()){
                    String key2 = (String)it2.next();
                    int f2 = (int)hm.get(key);
                    if( f2>1 && key2.length()>key.length()  ){

                        result = key2;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
    private static HashMap sortByKeys(Map map,boolean isAsc)
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
                Integer key1 = ((String)((Map.Entry)o1).getKey()).length();
                Integer key2 = ((String)((Map.Entry)o2).getKey()).length();
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