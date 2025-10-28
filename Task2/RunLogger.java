package studentlogger;

/**
 * Starts multiple threads that log learners' scores at once.
 */
public class RunLogger {
    public static void main(String[] args) {

        ResultWriter fileLogger = new ResultWriter("output_scores.csv");

        Thread a = new LearnerThread(new Learner("Alice", 101, 89), fileLogger);
        Thread b = new LearnerThread(new Learner("Bob", 102, 76), fileLogger);
        Thread c = new LearnerThread(new Learner("Charlie", 103, 92), fileLogger);

        a.start();
        b.start();
        c.start();

        try {
            a.join();
            b.join();
            c.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interruption occurred");
        }

        System.out.println("All learners have successfully uploaded their marks!");
    }
}


