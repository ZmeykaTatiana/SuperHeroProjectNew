package by.itstep.zmeyka.superheroproject.model.logic;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.container.DynamicTeam;
import by.itstep.zmeyka.superheroproject.model.logic.herorate.HeroRatable;

public class HeroRate {
    public static void rateByHealth(DynamicTeam team, HeroRatable ratable) {
        for (int i = 0; i < team.size() - 1; i++) {
            for (int j = 0; j < team.size() - 1 - i; j++) {
                if (ratable.compare(team.get(j),team.get(j+1))) {
                    Hero temp = team.get(j);
                    team.setHeroes(j, team.get(j + 1));
                    team.setHeroes(j + 1, temp);
                }

            }

        }
    }

    }




