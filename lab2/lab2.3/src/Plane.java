public class Plane {
    private String name;
    private int speed;

    public Plane(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public final String getName() {
        return name;
    }

    public final int getSpeed() {
        return speed;
    }
    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
