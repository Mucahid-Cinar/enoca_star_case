package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> star = new ArrayList<>();
        star.add("*");
        ArrayList<String> star1 = new ArrayList<>();
        star1.add("*");
        star1.add("*");

        for (int i = 0; i < 6; i++) {
            Iterator<String> iterator = star.iterator();
            while (iterator.hasNext()){
                String star3 = iterator.next();
                System.out.print(star3);
            }
            System.out.println();
            if (i == 0 ){
                star.removeAll(star);
            }
            star.addAll(star1);
        }

        System.out.println("------------------");
        //Another solution

        StringBuilder star4 = new StringBuilder();
        star4.append("*");
        StringBuilder star5 = new StringBuilder();
        star5.append("*");
        star5.append("*");

        for (int i = 0; i < 6; i++) {
            System.out.println(star4);
            if (i == 0 ){
                star4.delete(0,1);
            }
            star4.append(star5);
        }

    }
}