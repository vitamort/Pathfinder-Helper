package org.schoellerfamily.pathfinderhelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jonathanschoeller
 */
@SpringBootApplication
public class PathfinderHelperApplication {
    /**
     * @param args standard main program arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(PathfinderHelperApplication.class, args);
    }

    /**
     * @return the application name.
     */
    public final String getApplicationName() {
        return "pathfinder-helper";
    }
}
