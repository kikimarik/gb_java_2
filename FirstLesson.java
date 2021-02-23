import firstLesson.*;

public class FirstLesson {
    public static void main(String[] args) {
        MoveEntityInterface[] moveEntities = {
                new Human(222, 4),
                new Human(404, 2),
                new Cat(22, 8),
                new Cat(111, 5),
                new Robot(99999, 0),
                new Robot(250, 2),
                new Robot(555, 555)
        };
        Wall wall1 = new Wall();
        wall1.setHeight(3);
        Wall wall2 = new Wall();
        wall2.setHeight(6);
        Track track1 = new Track();
        track1.setLength(200);
        Track track2 = new Track();
        track2.setLength(400);
        BarrierInterface[] barriers = {
                wall1,
                track1,
                track2,
                wall2
        };

        for (MoveEntityInterface moveEntity :
                moveEntities) {
            for (BarrierInterface barrier :
                    barriers) {
                try {
                    if (barrier instanceof Wall) {
                        moveEntity.jump(barrier);
                    } else if (barrier instanceof Track) {
                        moveEntity.run(barrier);
                    }
                } catch (OutOfDistanceException exception) {
                    System.out.println(exception.getMessage());
                    break;
                }
            }
        }
    }
}
