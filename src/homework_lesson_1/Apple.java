package homework_lesson_1;

public class Apple extends Fruit{
    private final String name = "Apple";
    private float weight;

    public Apple() {
        this.weight = 1.0f;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
