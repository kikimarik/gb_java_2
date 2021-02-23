import secondLesson.ArrayWalker;
import secondLesson.MyArrayDataException;
import secondLesson.MyArraySizeException;

public class SecondLesson {
    public static void main(String[] args) {
        String[][] inputArray = {
                {
                        "1", "2", "3", "4"
                },
                {
                        "111", "2", "3", "-5"
                },
                {
                        "1", "7", "3", "4"
                },
                {
                        "8", "2", "3", "4"
                }
        };
        try {
            System.out.println(ArrayWalker.getStringMultiArraySum(inputArray));
        } catch (MyArrayDataException | MyArraySizeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
