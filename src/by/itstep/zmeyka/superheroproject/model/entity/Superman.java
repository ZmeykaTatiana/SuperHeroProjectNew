package by.itstep.zmeyka.superheroproject.model.entity;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;

import java.util.Objects;

public class Superman extends Hero {
    private int power;
    private int invulnerability;


    public Superman(){
    }
    public Superman(int power,int invulnerability,int health){
        super(health);
        this.power=power;
        this.invulnerability=invulnerability;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Superman superman = (Superman) o;
        return power == superman.power && invulnerability == superman.invulnerability;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power, invulnerability);
    }

    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power=power;
    }

    public int getInvulnerability(){
        return invulnerability;
    }
    public void setInvulnerability(int invulnerability){
        this.invulnerability=invulnerability;
    }



    @Override
    public String toString() {
        return "Superman { " +
                "power=" + power +
                ", invulnerability=" + invulnerability +" "+
                super.toString()+
                " }";
    }

    @Override
    public int compareTo(Hero o) {
        return super.compareTo(o);
    }
}
