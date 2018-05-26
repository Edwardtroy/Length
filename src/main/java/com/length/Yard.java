package com.length;

public class Yard {
    public int amount;

    public Yard(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        if(obj.getClass() == Yard.class){
            return this.amount == ((Yard)obj).amount;
        }

        if(obj.getClass() == Mile.class){
            return this.amount == ((Mile)obj).amount * 1760;
        }

        return false;
    }
}
