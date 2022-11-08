package Lesson11;

public interface MoveAbleInterface {

    static int speed() {
        return 0;
    }

    int Speed();

    default String getAnimalsName() {
        return getClass().getSimpleName();
    }

    boolean moveAble();

    String toString1();
}
