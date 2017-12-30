package org.schoellerfamily.pathfinderhelper.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.schoellerfamily.pathfinderhelper.datamodel.Character;
import org.schoellerfamily.pathfinderhelper.repository.CharacterRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jonathanschoeller
 */
@RestController
public class CharacterController {
    /**
     * Holds the persistence repository.
     */
    private CharacterRepository repository;

    /**
     * @param repository injects the persistence repository
     */
    public CharacterController(final CharacterRepository repository) {
        this.repository = repository;
    }

    /**
     * @CrossOrigin(origins = "http://localhost:4200") places localhost:4200 in the
     *                      Access-Control-Allow-Origin header of both the
     *                      pre-flight response and the actual response.
     * @return the collection of characters that are in the campaign
     */
    @GetMapping("/characters")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Character> charactersInCampaign() {
        return repository.findAll().stream().filter(this::inCampaign).collect(Collectors.toList());
    }

    /**
     * @param character the character that we are checking
     * @return true if the character is in the campaign
     */
    private boolean inCampaign(final Character character) {
        final String name = character.getName();
        return !"Budweiser".equals(name)
                && !"Coors Light".equals(name) && !"PBR".equals(name);
    }
}
