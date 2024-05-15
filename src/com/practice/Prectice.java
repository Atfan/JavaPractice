package com.practice;

import java.util.*;

public class Prectice {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        String[] arrStr={"Строка 1", "Строка 2", "Строка 3", "Строка 4", "Строка 5"};
        list1.addAll(List.of(arrStr));
        System.out.println(list1);
        System.out.println("-------------------------------------------");

        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);
        System.out.println("-------------------------------------------");

        List<String> list3 = Arrays.asList(new String[]{"Строка 6", "Строка 7", "Строка 8"});
        list2.addAll(3,list3);
        System.out.println(list2);
        System.out.println("-------------------------------------------");


        list2.sort(Collections.reverseOrder());
        System.out.println(list2);
        System.out.println("-------------------------------------------");

        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        System.out.println(list2);
        System.out.println("-------------------------------------------");

        System.out.println("------------------SET----------------------");

        Set<String> set1 = new HashSet<>();
        set1.add("Строка 99");
        set1.add("Строка 98");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println(set1);
        System.out.println("-------------------------------------------");

        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println(set2);
        System.out.println("-------------------------------------------");

        System.out.println("------------------MAP----------------------");

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1,"Січень");
        map1.put(2,"Лютий");
        map1.put(3,"Березень");
        map1.put(4,"Квітень");
        map1.put(5,"Травень");
        map1.put(6,"Червень");
        map1.put(7,"Липень");
        map1.put(8,"Серпень");
        map1.put(9,"Вересень");
        map1.put(10,"Жовтень");
        map1.put(11,"Листопад");
        map1.put(12,"Грудень");

        System.out.println(map1.get(0)+' '+map1.get(11));
        System.out.println(map1.get(1)+' '+map1.get(12));
        System.out.println("-------------------------------------------");
        map1.put(6,"ВІДПУСТКА");
        System.out.println(map1.get(6));
        System.out.println("-------------------------------------------");

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        ShowMap(map1);
        System.out.println("-------------------------------------------");
        ShowMap(map2);
    }

    private static void ShowMap(Map<Integer, String> map){
        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
