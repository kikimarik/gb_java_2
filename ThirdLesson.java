import thirdLesson.ContactMap;
import thirdLesson.UniqueWordMap;

public class ThirdLesson {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "tea",
                "orange",
                "tea",
                "beer",
                "carrot",
                "coffee",
                "orange",
                "cheese",
                "cheese",
                "tomato",
                "cheese",
                "orange"
        };
        UniqueWordMap wordMap = new UniqueWordMap(words);
        // wordMap.printUniqueWords();
        wordMap.setWord("tea"); // add tea
        // wordMap.printUniqueWords();
        ContactMap contactMap = new ContactMap();
        contactMap.add("+79990990909", "ivanov");
        contactMap.add("+79990990907", "petrov");
        contactMap.add("+79990990905", "sidorov");
        contactMap.add("+79990990903", "naumov");
        contactMap.add("+79990990908", "ivanov");
        System.out.println(contactMap.get("ivanov"));
        System.out.println(contactMap.get("petrov"));
    }
}
