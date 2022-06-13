package by.itstep.zmeyka.superheroproject.model.entity.abstracts;

public class Hero {
    private int health;

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
