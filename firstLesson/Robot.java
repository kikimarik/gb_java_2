package firstLesson;

public class Robot implements MoveEntityInterface {

    private int maxRunDistance;
    private int maxJumpDistance;

    public Robot(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public void run(BarrierInterface barrier) {
        String message;
        message = barrier.getLength() > this.maxRunDistance
                ? "The barrier length is greater then robot max run limit"
                : "Human successfully run the barrier";
        System.out.println(message);
    }

    @Override
    public void jump(BarrierInterface barrier) {
        String message;
        message = barrier.getHeight() > this.maxJumpDistance
                ? "The barrier height is greater then human max jump limit"
                : "Robot successfully jump the barrier";
        System.out.println(message);
    }
}
