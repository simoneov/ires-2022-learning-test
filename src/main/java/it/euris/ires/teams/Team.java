package it.euris.ires.teams;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Team {


    private String name;
    private final List<Person> personList;

    public Team(String name) {
        this.name=name;
        this.personList = new ArrayList<>();
    }

    public void addPerson(String person){
        personList.add(new Person(person,this.name));
    }

}
