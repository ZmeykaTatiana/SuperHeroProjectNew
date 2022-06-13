package by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.container.ListTeam;

public class ListTeamIterator implements MyIterator{
    private ListTeam team;
    private int current;

    public ListTeamIterator(ListTeam team){
        this.team=team;
        current=0;

    }

    @Override
    public Hero next() {
        return team.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current< team.size();
    }

    @Override
    public void reset() {
        current=0;

    }
}
