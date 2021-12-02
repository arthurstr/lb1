package com.arthur;

public class Cheese extends Food{
    public Cheese() {
        super("Сыр");
    }
    public String getName(){
        return name;
    }

    @Override
    public void consume() {
        System.out.println(this.name + " съеден");
    }
    public int calculateCalories(){
        return 25;
    }
}
