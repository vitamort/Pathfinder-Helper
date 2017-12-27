package org.schoellerfamily.pathfinderhelper.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.schoellerfamily.pathfinderhelper.PathfinderHelperApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jonathanschoeller
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PathfinderHelperApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = { "management.port=0" })
public class CharacterControllerTest {
    /** */
    @LocalServerPort
    private int port;

    /** */
    @Autowired
    private TestRestTemplate testRestTemplate;

    /** */
    @Test
    public final void testGoodBeersSuccess() {
        final String url = "http://localhost:" + port + "/good-beers";
        final ResponseEntity<String> entity = testRestTemplate.getForEntity(url, String.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
    }

    /** */
    @Test
    public final void testGoodBeersResult() {
        final String url = "http://localhost:" + port + "/good-beers";
        final ResponseEntity<String> entity = testRestTemplate.getForEntity(url, String.class);
        assertTrue(entity.getBody().startsWith("[ {\n"
                + "  \"id\" : 1,\n"
                + "  \"name\" : \"Kentucky Brunch Brand Stout\",\n"
                + "  \"playerid\" : null,\n"
                + "  \"strength\" : null,\n"
                + "  \"dexterity\" : null,\n"
                + "  \"constitution\" : null,\n"
                + "  \"intelligence\" : null,\n"
                + "  \"wisdom\" : null,\n"
                + "  \"charisma\" : null,\n"
                + "  \"gender\" : null,\n"
                + "  \"age\" : null,\n"));
    }
}
