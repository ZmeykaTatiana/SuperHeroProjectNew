package by.itstep.zmeyka.superheroproject.model.logic;

import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.Iterable;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.MyIterator;

public class Teamkit {
    private  Teamkit(){

    }
    public static double calculateTeamInvulnerability(Iterable iterable) {
        MyIterator iterator=iterable.getIterator();
        double total=0;

        while(iterator.hasNext()){
            total += iterator.next().getHealth();

        }

        return total;


    }
}
