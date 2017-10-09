package company.project;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Интеграционный тест.
 */
public class ITestSome {

    @Test
    public void testGetSome1() {
        assertEquals("111", Some.getSome1());
    }

    @Test
    public void testGetSome2() {
        assertEquals("222", Some.getSome2());
    }

}
