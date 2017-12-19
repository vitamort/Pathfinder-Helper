package org.schoellerfamily.pathfinderhelper.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.schoellerfamily.pathfinderhelper.datamodel.Character;
import org.schoellerfamily.pathfinderhelper.repository.CharacterRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    private CharacterRepository repository;

    public CharacterController(CharacterRepository repository) {
        this.repository = repository;
    }

    /**
     * @CrossOrigin(origins = "http://localhost:4200") places localhost:4200 in the Access-Control-Allow-Origin header of both the pre-flight response and the actual response.
     */
    @GetMapping("/good-beers")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Character> charactersInCampaign() {

        return repository.findAll().stream()
                .filter(this::inCampaign)
                .collect(Collectors.toList());
    }

    	//TODO change inCampaign to check of the characters are used in this campaign
    private boolean inCampaign(Character character) {
        return !character.getName().equals("Budweiser") &&
                !character.getName().equals("Coors Light") &&
                !character.getName().equals("PBR");
    }
}
