package homework_lesson_1;



import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Fruit> {
    private ArrayList<T> arr;



    public Box() {
        this.arr = new ArrayList<>();
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

    public void addFruit ( T... arr) {
        if (this.arr.size() == 0) {
            Collections.addAll(this.arr, arr);
        } else {
            for (int i = 0; i < arr.length; i++) {
                int c=0;
                for (int j = 0; j < this.arr.size(); j++) {
                    if (this.arr.get(j) == arr[i]) {
                        c++;
                    }
                }
                if (c == 0) {
                    this.arr.add(arr[i]);
                } else {
                    System.out.println(arr[i] + " уже имеется в коробке");
                }
            }
        }

    }


}
