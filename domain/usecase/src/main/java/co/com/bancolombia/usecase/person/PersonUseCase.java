package co.com.bancolombia.usecase.person;

import co.com.bancolombia.model.person.Person;
import co.com.bancolombia.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class PersonUseCase {
    private PersonRepository personRepository;

    public Optional<Person> getPerson(String id) {
        return this.personRepository.getPerson(id);
    }

    public Optional<Float> getBalance(String id) {
        return this.personRepository.getBalance(id);
    }
}
