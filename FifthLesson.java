import fifthLesson.ThreadUsage;

public class FifthLesson {
    public static void main(String[] args) {
        ThreadUsage app = new ThreadUsage(10000000);
        app.nonBalanced();
        app.twoCoresBalanced();
    }
}
