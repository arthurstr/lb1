package com.arthur;

public class Food implements Consumable,Nutrious{
    String name =null;
    public void consume(){
        System.out.println(this.name + "eat");
    }
    public int calculateCalories(){
        return 0;
    }
    public Food(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString() {
        return name;
    }
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }

}
