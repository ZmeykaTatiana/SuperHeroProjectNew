package by.itstep.zmeyka.superheroproject.model.entity;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;

import java.util.Objects;

public class WonderWoman extends Hero {
    private int skill;
    private int hardness;


    public WonderWoman(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WonderWoman woman = (WonderWoman) o;
        return skill == woman.skill && hardness == woman.hardness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skill, hardness);
    }

    public WonderWoman(int skill, int hardness, int survival){
        super(survival);
        this.skill=skill;
        this.hardness=hardness;

    }
    public int getSkill(){
        return skill;
    }
    public void setSkill(int skill){
        this.skill=skill;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }



    @Override
    public String toString() {
        return "WonderWoman { " +
                "skill=" + skill +
                ", hardness=" + hardness +" "+
                super.toString()+
                " }";
    }
}
