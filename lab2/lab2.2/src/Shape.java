public abstract class Shape {
        private final String name;

        public Shape(String name)
        {
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public abstract double Area();
        public abstract double Volume();
}
