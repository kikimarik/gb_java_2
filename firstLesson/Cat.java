package firstLesson;

public class Cat implements MoveEntityInterface {

    private int maxRunDistance;
    private int maxJumpDistance;

    public Cat(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public void run(BarrierInterface barrier) {
        String message;
        message = barrier.getLength() > this.maxRunDistance
                ? "The barrier length is greater then cat max run limit"
                : "Cat successfully run the barrier";
        System.out.println(message);
    }

    @Override
    public void jump(BarrierInterface barrier) {
        String message;
        message = barrier.getHeight() > this.maxJumpDistance
                ? "The barrier height is greater then cat max jump limit"
                : "Cat successfully jump the barrier";
        System.out.println(message);
    }
}
