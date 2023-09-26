package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here


    @Test
    public void testSettingJobId (){
        Job testJob = new Job();
        Job testJob2 = new Job();

        assertNotEquals(testJob, testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields (){
       Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertEquals(testJob3.getName(),  "Product tester");
        assertTrue(testJob3.getName(),  true);

        assertEquals(testJob3.getEmployer().getValue(),  "ACME");
        assertTrue(testJob3.getEmployer().getValue(),  true);

        assertEquals(testJob3.getLocation().getValue(),  "Desert");
        assertTrue(testJob3.getLocation().getValue(),  true);

        assertEquals(testJob3.getPositionType().getValue(),  "Quality control");
        assertTrue(testJob3.getPositionType().getValue(),  true);

        assertEquals(testJob3.getCoreCompetency().getValue(),  "Persistence");
        assertTrue(testJob3.getCoreCompetency().getValue(),  true);
    }

    @Test
    public void testJobsForEquality (){
        Job testJob4 = new Job( "Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(testJob4.getId(), testJob5.getId());



    }

    @Test
    public void testToStringStartsAndEndsWithNewLine (){

    }


}
