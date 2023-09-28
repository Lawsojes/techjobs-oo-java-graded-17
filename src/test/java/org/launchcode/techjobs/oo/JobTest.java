package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;


public class JobTest {
    // Create your unit tests here


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
    public void testToStringContainsCorrectLabelsAndData (){
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testJob6.toString(), lineSeparator() + "ID: 4" +
                lineSeparator() + "Name: Product tester" +
                lineSeparator() + "Employer: ACME" +
                lineSeparator() + "Location: Desert" +
                lineSeparator() + "Position Type: Quality control" +
                lineSeparator() + "Core Competency: Persistence" +
            lineSeparator());


    }
    @Test
    public  void testToStringHandlesEmptyField () {
        Job testJob7 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));

        assertEquals(testJob7.toString(), lineSeparator() + "ID: 3" +
                lineSeparator() + "Name: Product tester" +
                lineSeparator() + "Employer: Data not available" +
                lineSeparator() + "Location: Desert" +
                lineSeparator() + "Position Type: Quality control" +
                lineSeparator() + "Core Competency: Data not available" +
                lineSeparator());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        Job testJob7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        String firstChar = String.valueOf(testJob7.toString().charAt(0));
        String lastChar = String.valueOf(testJob7.toString().charAt(testJob7.toString().length()-1));

        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());

    }

}
