package com.prelude.epsilon.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author Ashok
 *
 */

/**
 * Unit test for <Class Name / Module Name >
 */
public class SampleTestClass  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SampleTestClass( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SampleTestClass.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
