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
        if (barrier.getLength() > this.maxRunDistance) {
            throw new OutOfDistanceException("The barrier length is greater then cat max run limit");
        }
        System.out.println("Cat successfully run the barrier");
    }

    @Override
    public void jump(BarrierInterface barrier) {
        if (barrier.getHeight() > this.maxJumpDistance) {
            throw new OutOfDistanceException("The barrier height is greater then cat max run limit");
        }
        System.out.println("Cat successfully jump the barrier");
    }
}
