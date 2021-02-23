package secondLesson;

public class ArrayWalker {

    public static int getStringMultiArraySum(String[][] intCandidates) {
        int columns = 4;
        int rows = 4;
        int sum = 0;
        if (intCandidates.length != columns) {
            throw new MyArraySizeException("Invalid array size");
        }
        for (String[] stringNode :
                intCandidates) {
            if (stringNode.length != rows) {
                throw new MyArraySizeException("Invalid array size");
            }
            for (String string :
                    stringNode) {
                try {
                    sum += Integer.parseInt(string);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException("Invalid int candidate: " + string);
                }
            }
        }
        return sum;
    }
}
