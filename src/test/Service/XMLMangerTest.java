package test.Service;

import Service.XMLManger;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import junit.framework.TestCase;

import static org.junit.Assert.*;

/**
 * XMLManger Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>五月 30, 2017</pre>
 */
public class XMLMangerTest extends TestCase{
    /**
     * Method: getMovieWithID(String id)
     */
    @Test
    public void testGetMovieWithID() throws Exception {
//TODO: Test goes here...
        assertEquals("0001", XMLManger.getMovieWithID("0001").getID());
        assertEquals("KONG: SKULL ISLAND", XMLManger.getMovieWithID("0001").getName());
        assertEquals("Resource/0001.png", XMLManger.getMovieWithID("0001").getPoster());
    }

    /**
     * Method: getMovieNum()
     */
    @Test
    public void testGetMovieNum() throws Exception {
//TODO: Test goes here...
        assertEquals(5, XMLManger.getMovieNum());
    }

    /**
     * Method: getScheduleListWithID(String movieID)
     */
    @Test
    public void testGetScheduleListWithID() throws Exception {
//TODO: Test goes here...
        assertEquals("0001", XMLManger.getScheduleListWithID("0001").get(0).getMovieID());
    }

    /**
     * Method: getScheduleWithID(String scheduleID)
     */
    @Test
    public void testGetScheduleWithID() throws Exception {
//TODO: Test goes here...
        assertEquals("0001", XMLManger.getScheduleWithID("0001").getID());
    }
} 
