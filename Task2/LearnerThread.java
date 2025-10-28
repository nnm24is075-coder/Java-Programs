package studentlogger;

/**
 * A thread that writes a learner's record to the file.
 */
public class LearnerThread extends Thread {
    private final Learner learner;
    private final ResultWriter writer;

    public LearnerThread(Learner learner, ResultWriter writer) {
        this.learner = learner;
        this.writer = writer;
    }

    @Override
    public void run() {
        try {
            writer.appendResult(learner);
        } catch (Exception e) {
            System.err.println("Could not log data for " + learner.toString());
        }
    }
}
