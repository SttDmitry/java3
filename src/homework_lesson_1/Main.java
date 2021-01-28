package homework_lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
        arrSwitch(arrList, 0 , 2);
        System.out.println(arrList.toString());
        System.out.println("");

        //2
        Object[] strArr = new String[]{"str1", "str2", "str3"};
        Object[] mas = new Integer[]{1,2,3,4};
        System.out.println(toArrList(mas).toString());
        System.out.println(toArrList(strArr).toString());
        System.out.println("");

        //3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Apple[] apples = new Apple[]{apple1, apple2};
        Apple[] apples2 = new Apple[]{apple3};
        Orange[] oranges = new Orange[]{orange1, orange2};

        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();
        Box<Apple> box3 = new Box();
        box1.addFruit(apples);
        box2.addFruit(oranges);
        box3.addFruit(apples2);
        box1.copyFrom(box3);

        System.out.println(box1.BoxWeight());
        System.out.println(box2.BoxWeight());
        System.out.println(box1.compareTo(box2));
    }

    public static <T> void arrSwitch (ArrayList<T> arr, int first, int last){
        if (first >= arr.size() || last >= arr.size()) {
            System.out.println("Выход за пределы массива!");
            return;
        }
        T temp1 = arr.get(first);
        T temp2 = arr.get(last);
        arr.set(first, temp2);
        arr.set(last, temp1);
        }

    public static ArrayList<?> toArrList (Object... arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
    }

