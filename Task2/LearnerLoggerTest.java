package studentlogger;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple JUnit tests for the learner logger project.
 */
public class LearnerLoggerTest {

    private static final String TEMP_FILE = "temp_results.csv";

    @BeforeEach
    void clearFile() throws IOException {
        Files.deleteIfExists(Paths.get(TEMP_FILE));
    }

    @Test
    void checkCSVFormat() {
        Learner l = new Learner("Test", 555, 88);
        String expected = "Test,555,88" + System.lineSeparator();
        assertEquals(expected, l.formatAsCSV());
    }

    @Test
    void verifyFileWriting() throws IOException {
        ResultWriter rw = new ResultWriter(TEMP_FILE);
        Learner l = new Learner("Kiran", 222, 91);
        rw.appendResult(l);

        String data = Files.readString(Paths.get(TEMP_FILE));
        assertTrue(data.contains("Kiran,222,91"));
    }

    @Test
    void ensureThreadsWriteProperly() throws Exception {
        ResultWriter rw = new ResultWriter(TEMP_FILE);
        Thread t1 = new LearnerThread(new Learner("Asha", 301, 80), rw);
        Thread t2 = new LearnerThread(new Learner("Ravi", 302, 75), rw);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        String output = Files.readString(Paths.get(TEMP_FILE));
        assertTrue(output.contains("Asha,301,80"));
        assertTrue(output.contains("Ravi,302,75"));
    }

    @AfterEach
    void deleteTempFile() throws IOException {
        Files.deleteIfExists(Paths.get(TEMP_FILE));
    }
}
