package co.com.bancolombia.personrepository;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonRepository;

import java.util.Optional;

public class PersonRepositoryPostgres implements PersonRepository {
    @Override
    public Optional<Person> getPerson(String id) {
        return Optional.of(Person.builder().id("1").balance("10000").build());
    }

    @Override
    public Optional<Float> getBalance(String id) {
        return Optional.of(10000f);
    }
}
