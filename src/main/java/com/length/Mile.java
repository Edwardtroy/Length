package com.length;


public class Mile {

    public int amount;

    public Mile(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        Class<?> objClass = obj.getClass();

        if(objClass == Yard.class){
            return ((Yard)obj).amount == 1760 * this.amount;
        }

        if(objClass == Mile.class){
            return ((Mile)obj).amount == this.amount;
        }

        return false;
    }
}
