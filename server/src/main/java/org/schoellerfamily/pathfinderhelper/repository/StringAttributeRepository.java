package org.schoellerfamily.pathfinderhelper.repository;

import org.schoellerfamily.pathfinderhelper.datamodel.StringAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * persistence repository for StringAttribute.
 *
 * @author jonathanschoeller
 *
 */
@RepositoryRestResource
public interface StringAttributeRepository extends JpaRepository<StringAttribute, Long> {
}
