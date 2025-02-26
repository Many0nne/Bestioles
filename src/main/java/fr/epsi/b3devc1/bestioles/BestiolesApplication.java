package fr.epsi.b3devc1.bestioles;

import fr.epsi.b3devc1.bestioles.Repository.AnimalRepository;
import fr.epsi.b3devc1.bestioles.Repository.PersonRepository;
import fr.epsi.b3devc1.bestioles.Repository.SpeciesRepository;
import fr.epsi.b3devc1.bestioles.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class BestiolesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BestiolesApplication.class, args);

    }

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private SpeciesRepository speciesRepository;

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(animalRepository.findAll());
//        System.out.println(personRepository.findAll());
//        System.out.println(speciesRepository.findAll());


//        System.out.println(animalRepository.findById(1L));

//          Person person = new Person();
//            person.setFirstname("John");
//            person.setLastname("Doe");
//            person.setAge(25);
//            person.setLogin("johndoe");
//            person.setMdp("password");
//            person.setActive(true);
//
//            personRepository.save(person);

//        personRepository.deleteById(9L);

//        System.out.println((personRepository.findAll().size()));


    }
}
