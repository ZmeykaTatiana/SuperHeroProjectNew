package by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;

public interface MyIterator {
    Hero next();
    boolean hasNext();
    void reset();
}
