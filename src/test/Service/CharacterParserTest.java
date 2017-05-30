package test.Service;

import Service.CharacterParser;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

/**
 * CharacterParser Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>五月 30, 2017</pre>
 */
public class CharacterParserTest {

    /**
     * Method: getRowWithChar(String row)
     */
    @Test
    public void testGetRowWithChar() throws Exception {
//TODO: Test goes here...
        assertEquals(1, CharacterParser.getRowWithChar("A"));
        assertEquals(2, CharacterParser.getRowWithChar("B"));
        assertEquals(3, CharacterParser.getRowWithChar("C"));
        assertEquals(4, CharacterParser.getRowWithChar("D"));
    }

    /**
     * Method: getTicketTypeWithNum(int type)
     */
    @Test
    public void testGetTicketTypeWithNum() throws Exception {
//TODO: Test goes here...
        assertEquals("Student", CharacterParser.getTicketTypeWithNum(4));
        assertEquals("Child", CharacterParser.getTicketTypeWithNum(1));
        assertEquals("Adult", CharacterParser.getTicketTypeWithNum(2));
        assertEquals("Senior", CharacterParser.getTicketTypeWithNum(3));
    }

    /**
     * Method: getRowWithNum(int row)
     */
    @Test
    public void testGetRowWithNum() throws Exception {
//TODO: Test goes here...
        assertEquals("A", CharacterParser.getRowWithNum(1));
        assertEquals("B", CharacterParser.getRowWithNum(2));
        assertEquals("C", CharacterParser.getRowWithNum(3));
        assertEquals("D", CharacterParser.getRowWithNum(4));
    }

    /**
     * Method: getIndexWithMovieID(String movieID)
     */
    @Test
    public void testGetIndexWithMovieID() throws Exception {
//TODO: Test goes here...
        assertEquals(1, CharacterParser.getIndexWithMovieID("0001"));
        assertEquals(2, CharacterParser.getIndexWithMovieID("0002"));
        assertEquals(3, CharacterParser.getIndexWithMovieID("0003"));
        assertEquals(4, CharacterParser.getIndexWithMovieID("0004"));
    }


} 
