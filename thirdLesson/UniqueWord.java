package thirdLesson;

public class UniqueWord {
    private int duplicateCounter;
    private final String name;

    public UniqueWord(String name) {
        this.name = name;
        this.duplicateCounter = 1;
    }

    public void incrementDuplicateCounter() {
        this.duplicateCounter++;
    }

    public String getNameWithCounter() {
        return this.name + " (" + this.duplicateCounter + ")";
    }
}
