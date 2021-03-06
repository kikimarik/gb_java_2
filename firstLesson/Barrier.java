package firstLesson;

abstract class Barrier implements BarrierInterface {

    protected int height = 0;
    protected int length = 0;

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getLength() {
        return this.length;
    }
}
