package by.itstep.zmeyka.superheroproject.model.entity.container;

import by.itstep.zmeyka.superheroproject.model.entity.abstracts.Hero;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.DynamicTeamIterator;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.Iterable;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.ListTeamIterator;
import by.itstep.zmeyka.superheroproject.model.entity.iteratorpattern.MyIterator;

public class ListTeam implements GeneralTeam, Iterable {
    private Node first;
    private int size;


    public ListTeam() {
        first = null;
        size = 0;

    }

    public int size() {
        return size;
    }

    @Override
    public Hero get(int index) {
        if(isEmpty()||index<0||index>=size){
            return null;
        }

        Node temp=first;
        for (int i = 0; i <index; i++) {
            temp=temp.next;

        }



        return temp.hero;
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public void add(Hero hero) {
        if (isEmpty()) {
            first = new Node(hero);
        }else {
            Node temp=first;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=new Node(hero);
        }
        size++;


    }

    @Override
    public MyIterator getIterator() {
        return new ListTeamIterator(this);
    }


    public class Node {
        public Hero hero;
        public Node next;

        public Node(Hero hero) {
            this.hero = hero;

        }


    }
    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();

        if (isEmpty()){
            builder.append("Team isn't assembled");
        }else{
            builder.append("Team: ");
            Node temp=first;
            while(temp.next!=null){
                builder.append("\n").append(temp.hero);
                temp=temp.next;

            }
            builder.append("\n").append(temp.hero);


            }

        return builder.toString();
        }


}

