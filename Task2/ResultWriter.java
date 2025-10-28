package studentlogger;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Handles writing each learner's data into a file.
 * Synchronized to make file access safe when multiple threads write.
 */
public class ResultWriter {
    private final String fileName;

    public ResultWriter(String fileName) {
        this.fileName = fileName;
    }

    public synchronized void appendResult(Learner learner) throws IOException {
        try (FileWriter file = new FileWriter(fileName, true)) {
            file.write(learner.formatAsCSV());
            System.out.println("Data saved: " + learner.formatAsCSV().trim());
        }
    }
}
