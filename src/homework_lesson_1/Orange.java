package homework_lesson_1;

public class Orange extends Fruit{
    private final String name = "Orange";
    private float weight;

    public Orange() {
        this.weight = 1.5f;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
