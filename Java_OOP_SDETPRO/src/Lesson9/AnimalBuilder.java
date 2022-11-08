package Lesson9;

public class AnimalBuilder {
    private String name;
    private int speed;
    private boolean withWings;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isWithWings() {
        return withWings;
    }

    public AnimalBuilder(String name, int speed, boolean withWings) {
        this.name = name;
        this.speed = speed;
        this.withWings = withWings;
    }

    protected static AnimalsBuilder builder() {
        return new AnimalsBuilder();
    }

    public static class AnimalsBuilder {
        private String name;
        private int speed;
        private boolean withWings;

        public AnimalBuilder build() {
            return new AnimalBuilder(name, speed, withWings);
        }

        public AnimalsBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalsBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public AnimalsBuilder setWithWings(boolean withWings) {
            this.withWings = withWings;
            return this;
        }
    }

    @Override
    public String toString() {
        return name + ", with speed= " + speed + ", withWings= " + withWings;
    }
}
