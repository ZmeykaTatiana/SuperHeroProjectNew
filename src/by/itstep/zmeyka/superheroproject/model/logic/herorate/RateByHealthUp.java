package by.itstep.zmeyka.superheroproject.model.logic.herorate;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.logic.HeroRate;

public class RateByHealthUp implements HeroRatable {
    @Override
    public boolean compare(Hero first, Hero second) {
        return first.getHealth() > second.getHealth();
    }
}
