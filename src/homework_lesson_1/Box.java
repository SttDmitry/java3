package homework_lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> arr;

    public Box(T... arr) {
        this.arr = new ArrayList<>(Arrays.asList(arr));
    }

    public float BoxWeight (){
        float sum = 0.0f;
        for (T t : arr) sum = sum + t.getWeight();
        return sum;
    }

    public boolean compareTo(Box<?> another) {
        return Math.abs(this.BoxWeight() - another.BoxWeight()) < 0.0001;
    }

    public void copyFrom ( Box<T> another) {

        this.arr.addAll(another.arr);
        another.arr.clear();
    }


}
