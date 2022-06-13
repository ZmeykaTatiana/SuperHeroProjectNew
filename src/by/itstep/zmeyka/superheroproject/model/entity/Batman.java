package by.itstep.zmeyka.superheroproject.model.entity;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;

import java.util.Objects;

public class Batman extends Hero {
    private int strength;
    private int protection;


    public Batman(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Batman batman = (Batman) o;
        return strength == batman.strength && protection == batman.protection;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), strength, protection);
    }

    public Batman(int strength, int protection, int life){
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
