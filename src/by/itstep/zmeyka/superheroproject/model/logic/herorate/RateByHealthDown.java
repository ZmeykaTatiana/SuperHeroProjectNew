package by.itstep.zmeyka.superheroproject.model.logic.herorate;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;

public class RateByHealthDown implements HeroRatable{
    @Override
    public boolean compare(Hero first, Hero second) {
        return first.getHealth() < second.getHealth();
    }
}
