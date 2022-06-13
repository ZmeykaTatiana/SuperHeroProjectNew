package by.itstep.zmeyka.superheroproject.model.entity.abstracts;

import java.util.Objects;

public class Hero {
    private int health;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return health == hero.health;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health);
    }

    public Hero(){

    }
    public Hero(int health){
        this.health=health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        }
    }

    @Override
    public String toString() {
        return "health= " + health;
    }
}
