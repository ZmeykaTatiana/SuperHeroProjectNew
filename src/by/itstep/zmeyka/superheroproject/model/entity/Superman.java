package by.itstep.zmeyka.superheroproject.model.entity;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;

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
}
