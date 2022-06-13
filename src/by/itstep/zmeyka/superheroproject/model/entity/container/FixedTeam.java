package by.itstep.zmeyka.superheroproject.model.entity.container;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.FixedTeamIterator;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.Iterable;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.MyIterator;

public class FixedTeam implements GeneralTeam, Iterable {
    public static final int DEFAULT_SIZE=15;
    private Hero[]array;
    private int size;

    public FixedTeam(){
        array=new Hero[DEFAULT_SIZE];
        size=0;

    }
    public FixedTeam(int capacity){
        array=new Hero[capacity];
        size=0;
    }
    public FixedTeam(Hero[]array){
        this.array=array;
        size=array.length;
    }
    public Hero get(int index){
        return array[index];
    }


    public void setHeroes(int index,Hero hero){
        array[index]=hero;
    }
    public int size(){
        return size;
    }
    public int capacity(){
        return array.length;
    }
    public void add(Hero hero) {
        if (hero == null) {
            return;
        }

        int i = 0;

        if (size< array.length) {
            array[size++]=hero;
        }


    }
    public boolean isEmpty(){
        return size==0;
    }



    public void removeHero(int index) {
        if (isEmpty()||(index<0&& index>=size)){
            return;
        }

        if(index==size-1){
            array[index]=null;
        } else {
            for (int i = index; i < size; i++) {
                array[i]=array[i+1];

            }
        }

            size--;

        }
    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();

        if (isEmpty()){
            builder.append("Team isn't assembled");
        }else{
            builder.append("Team: ");

            for (int i = 0; i < size; i++) {
                builder.append("\n").append(array[i]);
            }


        }

        return builder.toString();
    }


    @Override
    public MyIterator getIterator() {
        return new FixedTeamIterator(this);
    }
}
