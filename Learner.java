package studentlogger;

/**
 * Represents one learner’s information: name, USN and marks.
 */
public class Learner {
    private String fullName;
    private int regNo;
    private int score;

    public Learner(String fullName, int regNo, int score) {
        this.fullName = fullName;
        this.regNo = regNo;
        this.score = score;
    }

    // Converts data into comma-separated text for saving
    public String formatAsCSV() {
        return fullName + "," + regNo + "," + score + System.lineSeparator();
    }

    @Override
    public String toString() {
        return fullName + " [USN: " + regNo + ", Marks: " + score + "]";
    }
}
