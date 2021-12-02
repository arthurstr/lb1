package com.arthur;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        boolean caloriesneded=false;
        boolean sortneded=false;
        int calories=0;
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else if (parts[0].equals("icecream")) {
                breakfast[itemsSoFar] = new icecream(parts[1]);
            }
            itemsSoFar++;
            if (parts[0].equals("-calories")){
                caloriesneded=true;
            }
            if (parts[0].equals("-sort"))
                sortneded=true;
        }
        if (caloriesneded){
            for (Food item: breakfast){
                if (item != null){
                    calories+=item.calculateCalories();
                }else {
                    System.out.println("Калорий съедено:"+calories);
                    break;
                }
            }
        }
        if (sortneded) Arrays.sort(breakfast, new SortFood());
        for (Food item : breakfast){
            if (item != null) item.consume();
            else break;
        }
        System.out.println("Всего хорошего!");
    }


}
