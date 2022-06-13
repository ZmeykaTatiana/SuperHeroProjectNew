package by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.container.DynamicTeam;

public class DynamicTeamIterator implements MyIterator{
    private DynamicTeam team;
    private int current;

    public DynamicTeamIterator(DynamicTeam team){
        this.team=team;
        current=0;
    }

    @Override
    public Hero next() {
        return team.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current<team.size();
    }

    @Override
    public void reset() {
        current=0;
    }



    }

