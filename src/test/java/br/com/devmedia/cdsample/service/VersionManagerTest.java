package br.com.devmedia.cdsample.service;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import br.com.devmedia.cdsample.AppConfigTest;

@Test
@ContextConfiguration(classes = AppConfigTest.class)
public class VersionManagerTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private VersionManager versionManager;

    public void shouldNotBeNullVersion() {
        assertNotNull(versionManager.manage());
    }

    public void shouldNotBeAnEmptyVersion() {
        assertFalse(versionManager.manage().isEmpty());
    }

}
