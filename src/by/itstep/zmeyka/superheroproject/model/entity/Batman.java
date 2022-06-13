package by.itstep.zmeyka.superheroproject.model.entity;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;

public class Batman extends Hero {
    private int strength;
    private int protection;


    public Batman(){
    }
    public Batman(int strength,int protection,int life){
        super(life);
        this.strength=strength;
        this.protection=protection;

    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }



    @Override
    public String toString() {
        return "Batman { " +
                "strength=" + strength +
                ", protection=" + protection +" "+
                super.toString()+
                " }";
    }
}
