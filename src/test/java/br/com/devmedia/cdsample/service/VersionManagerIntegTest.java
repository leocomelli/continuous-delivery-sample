package br.com.devmedia.cdsample.service;

import static org.testng.Assert.assertTrue;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import br.com.devmedia.cdsample.AppConfigTest;

@Test
@ContextConfiguration(classes = AppConfigTest.class)
public class VersionManagerIntegTest extends AbstractTestNGSpringContextTests {

    public void fakeIntegrationTest() {
        // Implements an integration test here!

        assertTrue(true);
    }

}
