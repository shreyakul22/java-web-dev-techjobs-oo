package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


    public class JobTest {
        //Construct test objects
        Job testJob1, testJob2,testJob3,testJob4;

        //Test job
        @Before
        public void setup() {
            testJob1 = new Job();
            testJob2 = new Job();
            testJob3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
            testJob4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        }
        @Test
        public void testSettingJobId() {
            assertEquals(1, testJob2.getId() - testJob1.getId());
        }

        //Test all the fields of class job
        @Test
        public void testForFields() {
            assertEquals("Product Tester", testJob3.getName());
            assertEquals("ACME", testJob3.getEmployer().getValue());
            assertEquals("Desert", testJob3.getLocation().getValue());
            assertEquals("Quality Control", testJob3.getPositionType().getValue());
            assertEquals("Persistence", testJob3.getCoreCompetency().getValue());
        }
        //Test that id equality method works
        @Test
        public void testEquality() {
            assertFalse(testJob1.equals(testJob2));
            assertFalse(testJob3.equals(testJob4));
        }
        public void jobConstructorTest() {
            Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
            assertEquals(1,jobTest.getId());
        }
        @Test
        public void jobString() {
            Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
            assertEquals("ID: 12" + "\n" +
                    "Name: Product Tester\n" +
                    "employer: ACME\n" +
                    "Location: Desert\n" +
                    "positionType: Quality Control\n" +
                    "coreCompetency: Persistence\n", testJob3.toString());
        }
        //Test PositionType
        @Test
        public void jobPositionType() {
            PositionType testPositionType = new PositionType("string");
            assertEquals("string",testPositionType.toString());
        }

        @Test
        public void jobExist() {
            Job jobTest = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            assertEquals(" job does not seem to exist.",jobTest.toString());
        }
        //Test Employer
        @Test
        public void jobEmployer() {
            Employer testEmployer = new Employer("string");
            assertEquals("string",testEmployer.toString());
        }


        @Test
        public void jobNotAvailableTest() {
            Job jobTest = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
            assertEquals("ID: 9" + "\n" +
                    "Name: Product tester\n" +
                    "employer: Data not available\n" +
                    "Location: Data not available\n" +
                    "positionType: Data not available\n" +
                    "coreCompetency: Data not available\n", jobTest.toString());
        }
        //Test CoreCompetency
        @Test
        public void jobCoreCompetency() {
            CoreCompetency testEmployer1 = new CoreCompetency("string");
            assertEquals("string",testEmployer1.toString());
        }

        //Test Location
        @Test
        public void jobLocation() {
            Location testLocation = new Location("string");
            assertEquals("string",testLocation.toString());
        }



    }
