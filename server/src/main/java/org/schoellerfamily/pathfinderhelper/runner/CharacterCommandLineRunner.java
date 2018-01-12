package org.schoellerfamily.pathfinderhelper.runner;

import org.schoellerfamily.pathfinderhelper.datamodel.Character;
import org.schoellerfamily.pathfinderhelper.datamodel.IntegerAttribute;
import org.schoellerfamily.pathfinderhelper.datamodel.StringAttribute;
import org.schoellerfamily.pathfinderhelper.repository.CharacterRepository;
import org.schoellerfamily.pathfinderhelper.repository.IntegerAttributeRepository;
import org.schoellerfamily.pathfinderhelper.repository.StringAttributeRepository;
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
    /** */
    private final IntegerAttributeRepository iarepo;
    /** */
    private final StringAttributeRepository sarepo;

    /**
     * @param repository the persistence repository for characters
     * @param iarepo the persistence repository for integer attributes
     * @param sarepo the persistence repository for string attributes
     */
    public CharacterCommandLineRunner(
            final CharacterRepository repository, final IntegerAttributeRepository iarepo,
            final StringAttributeRepository sarepo) {
        this.repository = repository;
        this.iarepo = iarepo;
        this.sarepo = sarepo;
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
                .forEach(name -> {
                    final Character character = new Character();
                    character.setName(name);
                    for (IntegerAttribute a : character.getIntegerAttributes()) {
                        iarepo.save(a);
                    }
                    for (StringAttribute a : character.getStringAttributes()) {
                        sarepo.save(a);
                    }
                    repository.save(character);
                });
        repository.findAll().forEach(System.out::println);
    }
}
