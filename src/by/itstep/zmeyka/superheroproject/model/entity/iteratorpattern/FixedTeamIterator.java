package by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.container.FixedTeam;

public class FixedTeamIterator implements MyIterator {
    private FixedTeam team;
    private int current;

    public FixedTeamIterator(FixedTeam team){
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
