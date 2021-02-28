package thirdLesson;

import java.util.HashMap;

public class UniqueWordMap {
    private final HashMap<String,UniqueWord> wordMap = new HashMap<>();

    public UniqueWordMap (String[] words) {
        for (String word :
                words) {
            this.setWord(word);
        }
    }

    public void setWord(String s) {
        UniqueWord word = wordMap.get(s);
        if (word != null) {
            word.incrementDuplicateCounter();
        } else {
            wordMap.put(s, new UniqueWord(s));
        }
    }

    public void printUniqueWords() {
        for (UniqueWord word :
                wordMap.values()) {
            System.out.println(word.getNameWithCounter());
        }
    }
}
