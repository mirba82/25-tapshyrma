package com.company;

import java.util.*;

public class Main {
    /*Эки setтин симметриялык айырмасын эсептеген
    symmetricDifference методун ишке ашырыныз.
    Метод натыйжаны жаңы set катары кайтарышы керек.
    Методко параметр катары берилген setтерди өзгөртүүгө
    жол берилбейт.
    Мисалы: [1, 2, 3} жана {0, 1, 2]
    Жооп: [0, 3]
    -/public static Set<Integer> symmetricDifference
    (Set<Integer> set1, Set<Integer> set2) методу болушу керек*/

    public static void main(String args[]) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>(set);

        set.removeAll(set1);
        set1.removeAll(set2);

        Set<Integer> newSet = new HashSet<>(set);
        newSet.addAll(set1);

        System.out.println(newSet);

    }
}
