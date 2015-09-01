package com.kfcstandard.javafxarchetype.tests;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class defines JUnit rules that every test method in every test class
 * that instantiates this class will follow during its lifecycle.
 *
 * The rules in this class log the name of every test that is run and log every
 * test that fails.
 *
 * @author Ken Fogel
 *
 */
public class MethodLogger extends TestWatcher {

    // See method prepareLogger for the reason the logger is not
    // instantiated here.
    private Logger log;

    /**
     * Constructor
     */
    public MethodLogger() {
        super();
    }

    /**
     * Whenever a test starts, this method logs the name of the test method as
     * provided by the description.
     *
     * @param description describes a test which is to be run or has been run
     */
    @Override
    protected void starting(Description description) {
        prepareLogger(description);
        log.info("Starting test [{}]", description.getMethodName());
    }

    /**
     * Whenever a test fails, this method logs the name of the test method as
     * provided by the description and the exception thrown.
     *
     * @param e
     * @param description describes a test which is to be run or has been run
     */
    @Override
    protected void failed(Throwable e, Description description) {
        log.info("Failed test [{}]", description.getMethodName() + "\n" + e.getMessage());
    }

    /**
     * If logger is not initialized, initialize it with the name of the test
     * class as provided by the description.
     *
     * @param description describes a test which is to be run or has been run
     *
     */
    private void prepareLogger(Description description) {
        if (log == null) {
            log = LoggerFactory.getLogger(description.getClassName());
        }
    }
}
