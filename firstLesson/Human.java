package firstLesson;

public class Human implements MoveEntityInterface {

    private int maxRunDistance;
    private int maxJumpDistance;

    public Human(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public void run(BarrierInterface barrier) {
        String message;
        message = barrier.getLength() > this.maxRunDistance
                ? "The barrier length is greater then human max run limit"
                : "Human successfully run the barrier";
        System.out.println(message);
    }

    @Override
    public void jump(BarrierInterface barrier) {
        String message;
        message = barrier.getHeight() > this.maxJumpDistance
                ? "The barrier height is greater then human max jump limit"
                : "Human successfully jump the barrier";
        System.out.println(message);
    }
}
