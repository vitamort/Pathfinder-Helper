package org.schoellerfamily.pathfinderhelper.repository;

import org.schoellerfamily.pathfinderhelper.datamodel.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
