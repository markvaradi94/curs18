package ro.fasttrackit.mvnbase.curs18.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService {
    private List<Person> personList;

    public PersonService(List<Person> personList) {
        if (personList == null) {
            this.personList = new ArrayList<>();
        } else {
            this.personList = new ArrayList<>(personList);
        }
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Optional<Person> getByName(String name) {
        for (Person person : this.personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> getByAge(int age) {
        for (Person person : this.personList) {
            if (person.getAge() == age) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
