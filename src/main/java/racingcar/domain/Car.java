package racingcar.domain;

import static racingcar.option.Option.INITIAL_POSITION;

import java.util.Objects;

public class Car {

    private final Name name;
    private int position;

    public Car(Name name) {
        this(name, INITIAL_POSITION);
    }

    public Car(Name name, int position) {
        validatePositionOverInitialPosition(position);
        this.name = name;
        this.position = position;
    }

    public int selectMaxPosition(int otherPosition) {
        return Math.max(position, otherPosition);
    }

    public boolean hasSamePositionWith(int otherPosition) {
        return position == otherPosition;
    }

    public void move(MoveChance moveChance) {
        if (moveChance.isMovable()) {
            position++;
        }
    }

    private void validatePositionOverInitialPosition(int position) {
        if (position < INITIAL_POSITION) {
            throw new IllegalArgumentException("[ERROR] 위치는 시작점보다 작으면 안됩니다.");
        }
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
