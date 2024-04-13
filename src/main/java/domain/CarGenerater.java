package domain;

import java.util.ArrayList;
import java.util.List;

public class CarGenerater {
    private String[] splitEntry(String input) {
        String splitPoint = ",";

        String[] entryCars = removeGap(input).split(splitPoint);

        return entryCars;
    }

    private String removeGap(String input) {
        return input.replace(" ", "");
    }

    public List<Car> putInCars(String input) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < splitEntry(input).length; i++) {
            carList.add(new Car(splitEntry(input)[i], 0));
        }
        return carList;
    }
}
