package org.schoellerfamily.pathfinderhelper.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.schoellerfamily.pathfinderhelper.PathfinderHelperApplication;
import org.schoellerfamily.pathfinderhelper.datamodel.Character;
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
    public final void testCharacterListSuccess() {
        final String url = "http://localhost:" + port + "/characters";
        final ResponseEntity<String> entity = testRestTemplate.getForEntity(url, String.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
    }

    /** */
    @Test
    public final void testCharacterListResult() {
        final String url = "http://localhost:" + port + "/characters";
        final ResponseEntity<String> entity = testRestTemplate.getForEntity(url, String.class);
        assertTrue(entity.getBody().startsWith("[ {\n" + "  \"id\" : 1,\n"
                + "  \"name\" : \"Kentucky Brunch Brand Stout\",\n"
                + "  \"playerid\" : 0,\n"
                + "  \"integerAttributes\" : [ {\n"
                + "    \"id\" : 1,\n"
                + "    \"name\" : \"strength\",\n"
                + "    \"value\" : 10\n"
                + "  }, {\n"
                + "    \"id\" : 2,\n"
                + "    \"name\" : \"dexterity\",\n"
                + "    \"value\" : 10\n"
                + "  }, {\n" + "    \"id\" : 3,\n"
                + "    \"name\" : \"constitution\",\n"
                + "    \"value\" : 10\n" + "  }, {\n"
                + "    \"id\" : 4,\n"
                + "    \"name\" : \"intelligence\",\n"
                + "    \"value\" : 10\n" + "  }, {\n"
                + "    \"id\" : 5,\n" + "    \"name\" : \"wisdom\",\n"
                + "    \"value\" : 10\n"
                + "  }, {\n"
                + "    \"id\" : 6,\n"
                + "    \"name\" : \"charisma\",\n"
                + "    \"value\" : 10\n"
                + "  }, {\n"
                + "    \"id\" : 7,\n"
                + "    \"name\" : \"age\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 8,\n"
                + "    \"name\" : \"height\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 9,\n"
                + "    \"name\" : \"weight\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 10,\n"
                + "    \"name\" : \"base attack bonus\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 11,\n"
                + "    \"name\" : \"size\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 12,\n"
                + "    \"name\" : \"maximum health\",\n"
                + "    \"value\" : 10\n"
                + "  }, {\n"
                + "    \"id\" : 13,\n"
                + "    \"name\" : \"fortitude\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 14,\n"
                + "    \"name\" : \"reflex\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 15,\n"
                + "    \"name\" : \"will\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 16,\n"
                + "    \"name\" : \"land speed\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 17,\n"
                + "    \"name\" : \"swim speed\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 18,\n"
                + "    \"name\" : \"flight speed\",\n"
                + "    \"value\" : 0\n"
                + "  }, {\n"
                + "    \"id\" : 19,\n"
                + "    \"name\" : \"burrow speed\",\n"
                + "    \"value\" : 0\n" + "  }, {\n"
                + "    \"id\" : 20,\n"
                + "    \"name\" : \"height\",\n"
                + "    \"value\" : 0\n"
                + "  } ],\n"
                + "  \"stringAttributes\" : [ {\n"
                + "    \"id\" : 1,\n"
                + "    \"name\" : \"gender\",\n"
                + "    \"value\" : \"male\"\n"
                + "  }, {\n"
                + "    \"id\" : 2,\n"
                + "    \"name\" : \"description\",\n"
                + "    \"value\" : \"\"\n"
                + "  }, {\n" + "    \"id\" : 3,\n"
                + "    \"name\" : \"flight maneuverability\",\n"
                + "    \"value\" : \"\"\n"
                + "  } ],\n"
                + "  \"race\" : null,\n"
                + "  \"levels\" : [ ],\n"
                + "  \"inventory\" : [ ],\n"
                + "  \"skillranks\" : [ ],\n"
                + "  \"abilities\" : [ ]\n"
                + "}"));
    }

    /** */
    @Test
    public final void testCharacterByIdSuccess() {
        final String url = "http://localhost:" + port + "/characters/" + Long.valueOf((long) 1);
        final ResponseEntity<Character> entity = testRestTemplate.getForEntity(url,
                Character.class);
        assertTrue(entity.getBody().getName().equals("Kentucky Brunch Brand Stout"));
    }
}
