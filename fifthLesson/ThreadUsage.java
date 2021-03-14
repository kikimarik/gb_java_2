package fifthLesson;

import java.util.Arrays;

public class ThreadUsage {

    private final float[] inputArr;

    public ThreadUsage(int size) {
        inputArr = new float[size];
    }

    public void nonBalanced() {
        Arrays.fill(this.inputArr, 1.0F);
        long start = System.currentTimeMillis();
        this.setArr(this.inputArr, 0);
        long finish = System.currentTimeMillis() - start;
        System.out.println(finish + "ms without balancing");
    }

    public void twoCoresBalanced() {
        Arrays.fill(this.inputArr, 1.0F);
        long start = System.currentTimeMillis();
        int extraLength = (this.inputArr.length % 2 == 0) ? 0 : 1;
        int partSize = (this.inputArr.length + extraLength) / 2;
        float[] firstPart = new float[partSize];
        float[] secondPart = new float[partSize];
        System.arraycopy(this.inputArr, 0, firstPart, 0, partSize);
        System.arraycopy(this.inputArr, partSize, secondPart, 0, partSize - extraLength);
        Thread firstThread = new Thread(() -> this.setArr(firstPart, 0));
        Thread secondThread = new Thread(() -> this.setArr(secondPart, partSize + extraLength - 1));
        try {
            firstThread.start();
            firstThread.join();
            secondThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println(finish + "ms with balancing for 2 cores");
    }

    private void setArr(float[] arr, int offset) {
        for (int i = 0; i < arr.length; i++) {
            this.inputArr[i + offset] =
                    (float) (arr[i] * Math.sin(0.2f + i / 5.0) * Math.cos(0.2f + i / 5.0) * Math.cos(0.4f + i / 2.0));
        }
    }
}
