package com.arthur;

public class icecream extends Food {
    String sirup;

    public icecream(String sirup) {
        super("icecream");
        this.sirup = sirup;
    }

    public String getsirup() {
        return sirup;
    }

    public void setsirup(String preparedness) {
        this.sirup = sirup;
    }

    public void consume() {
        System.out.println(this + "съеденo");
    }

    public String toString() {
        return super.toString() + " " + sirup + " ";
    }

    public boolean equals(Object b) {
        if (super.equals(b)) {
            if (!(b instanceof icecream)) {
                return false;
            }
            if (sirup.equals(((icecream) b).sirup)) {
                return true;
            } else return false;
        } else return false;
    }

    public int calculateCalories() {
        int calories = 0;
        if (this.sirup.equals("caramel")) {
            calories += 65;
        }
        if (this.sirup.equals("chocolate")) {
            calories += 50;
        }

        return calories;
    }
}


