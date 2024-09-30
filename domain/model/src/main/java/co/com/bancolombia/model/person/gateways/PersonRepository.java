package co.com.bancolombia.model.person.gateways;

import co.com.bancolombia.model.person.Person;

import java.util.Optional;

public interface PersonRepository {
    Optional<Person> getPerson();
    Optional<Float> getBalance();
}
