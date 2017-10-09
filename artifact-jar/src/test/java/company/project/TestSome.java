package company.project;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Обычный unit-тест.
 */
public class TestSome {

    @Test
    public void testGetSome1() {
        assertEquals("111", Some.getSome1());
    }

    @Test
    public void testGetSome2() {
        assertEquals("222", Some.getSome2());
    }

}
