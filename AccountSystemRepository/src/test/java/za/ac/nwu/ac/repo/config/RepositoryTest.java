package za.ac.nwu.ac.repo.config;//package za.ac.nwu.ac.repo.persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {RepositoryConfig.class})
public class RepositoryTest {
    @Autowired
    RepositoryConfig repository;
    @Before
    public void setUp() throws Exception {
        // What happens before each test
    }
    @After
    public void tearDown() throws Exception {
        // What happens after each test
    }
    @Test
    public void test() {
        // Write a test here
    }
}
