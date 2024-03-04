package MyNewHomeworkUsingGit.l35;

import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Bobr> bobrList = new ArrayList<>();

        bobrList.add(new Bobr("Шуша", 3, 6));
        bobrList.add(new Bobr("Груша", 5, 2));
        bobrList.add(new Bobr("Тутуша", 1, 3));

        Collections.sort(bobrList);

        System.out.println("Список борбов после сортировки:\n " + bobrList);

        Collections.sort(bobrList, new NameComparator());

        System.out.println("Список борбов после сортировки по имени:\n " + bobrList);

        Collections.sort(bobrList, new RelativeCountComparator());

        System.out.println("Список борбов после кол-ву родественников:\n " + bobrList);

        Map<String, Integer> bobrHashMap;
        bobrHashMap = new HashMap<>();
        bobrHashMap.put("Шуша", 6);
        bobrHashMap.put("Груша", 2);
        bobrHashMap.put("Тутуша", 3);

        System.out.println(bobrHashMap);

    }
}