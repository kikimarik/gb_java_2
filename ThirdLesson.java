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
        wordMap.printUniqueWords();
        wordMap.setWord("tea"); // add tea
        // wordMap.printUniqueWords();
    }
}
