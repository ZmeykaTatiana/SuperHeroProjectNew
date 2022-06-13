package by.itstep.zmeyka.superheroproject.model.entity.container;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.DynamicTeamIterator;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.Iterable;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.MyIterator;

import java.util.Iterator;

public class DynamicTeam implements GeneralTeam, Iterable {
    private Hero[] heroes;


    public DynamicTeam() {
        heroes=new Hero[0];
    }

    public DynamicTeam(Hero[]heroes) {
        this();
        if (heroes!=null){
            this.heroes = heroes;
        }



    }

    public int size(){
        return heroes.length;
    }





    public Hero get(int index){
        return heroes[index];
    }


    public void setHeroes(int index,Hero hero){
        heroes[index]=hero;
    }


    public void add(Hero hero) {
        if (hero==null){
            return;
        }
        Hero[]temp = new Hero[heroes.length + 1];
        int i = 0;
        for (; i < heroes.length; i++) {
            temp[i] = heroes[i];

        }
        temp[i] = hero;
        heroes = temp;

    }

    public void removeHero(int index) {
        Hero[] temp = new Hero[heroes.length + 1];

        for (int i = 0, j = 0; i < heroes.length; i++) {
            if (i != index) {
                temp[j++] = heroes[i];

            }

            heroes = temp;

        }

    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();

        if (heroes.length==0){
            builder.append("Team isn't assembled");
        }else{
            builder.append("Team: ");

            for (Hero hero:heroes) {
                builder.append("\n").append(hero);
            }


        }

        return builder.toString();
    }


    @Override
    public MyIterator getIterator() {
        return new DynamicTeamIterator(this);
    }
}
