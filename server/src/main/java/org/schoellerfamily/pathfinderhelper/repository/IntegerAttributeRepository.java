package org.schoellerfamily.pathfinderhelper.repository;

import org.schoellerfamily.pathfinderhelper.datamodel.IntegerAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * persistence repository for IntegerAttribute.
 *
 * @author jonathanschoeller
 *
 */
@RepositoryRestResource
public interface IntegerAttributeRepository extends JpaRepository<IntegerAttribute, Long> {
}
