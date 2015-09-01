package com.kfcstandard.javafxarchetype.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Rule;

/**
 * Basic class for a JUnit4 unit test
 *
 * Unit test classes should be placed in packages that match the name of the
 * package of the class being tested
 *
 * #KFCStandard and JavaFX8
 *
 * @author Ken Fogel
 */
public class ArchetypeJavaFXUnitTest {

    // A Rule is implemented as a class with methods that are associared
    // with the lifecycle of a unit test. These methods run when required.
    // Avoids the need to cut and paste code into every test method.
    @Rule
    public MethodLogger methodLogger = new MethodLogger();

    /**
     * One time action when class is instantiated
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * One time action just before object is destroyed
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Action that occurs before every @Test annotated method
     */
    @Before
    public void setUp() {
    }

    /**
     * Action that occurs after every @Test annotated method
     */
    @After
    public void tearDown() {
    }

    /**
     * Live tests should always fail until they perform an actual test.
     *
     * @Ignore annotation is used so that the test is not run otherwise the fail
     * will end the build
     *
     */
    @Ignore
    @Test
    public void sampleFail() {
        fail();
    }

    /**
     * Test that always passes used to demonstrate the @Rules feature
     */
    @Test
    public void samplePass() {
        assertTrue(true);
    }
}
