package org.schoellerfamily.pathfinderhelper.runner;

import org.schoellerfamily.pathfinderhelper.datamodel.Character;
import org.schoellerfamily.pathfinderhelper.repository.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * Demo command line runner.
 *
 * @author jonathanschoeller
 */
@Component
public class CharacterCommandLineRunner implements CommandLineRunner {
    /**
     * Holds the persistence repository.
     */
    private final CharacterRepository repository;

    /**
     * @param repository the persistence repository
     */
    public CharacterCommandLineRunner(final CharacterRepository repository) {
        this.repository = repository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run(final String... strings) throws Exception {
        // this is a method from the original demo that was copied to be the skeleton
        // for this project
        Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR")
                .forEach(name -> repository.save(new Character()));
        repository.findAll().forEach(System.out::println);
    }
}
