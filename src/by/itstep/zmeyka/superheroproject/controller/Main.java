package by.itstep.zmeyka.superheroproject.controller;

import by.itstep.zmeyka.superheroproject.model.entity.Batman;
import by.itstep.zmeyka.superheroproject.model.entity.Superman;
import by.itstep.zmeyka.superheroproject.model.entity.WonderWoman;
import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.container.DynamicTeam;
import by.itstep.zmeyka.superheroproject.model.entity.container.FixedTeam;
import by.itstep.zmeyka.superheroproject.model.entity.container.ListTeam;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.DynamicTeamIterator;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.FixedTeamIterator;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.Iterable;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.MyIterator;
import by.itstep.zmeyka.superheroproject.model.logic.HeroRate;
import by.itstep.zmeyka.superheroproject.model.logic.Teamkit;
import by.itstep.zmeyka.superheroproject.model.logic.herorate.HeroRatable;
import by.itstep.zmeyka.superheroproject.model.logic.herorate.RateByHealthDown;

public class Main {
    public static void main(String[] args) {
        Batman batman=new Batman(30,55,89);
        Superman superman=new Superman(84,96,115);
        WonderWoman woman=new WonderWoman(96,85,100);

        DynamicTeam team=new DynamicTeam();
        team.add(batman);
        team.add(superman);
        team.add(woman);



        MyIterator iterator=new DynamicTeamIterator(team);
        HeroRate.rateByHealth(team,new RateByHealthDown());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator.reset();
       double total=Teamkit.calculateTeamInvulnerability(team);
       System.out.println("Total health: "+ total);






    }




}
