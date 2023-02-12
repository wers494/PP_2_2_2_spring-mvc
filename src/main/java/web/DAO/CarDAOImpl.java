package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> carsList = List.of(
            new Car("Mercedes-Benz", "E200", 245),
            new Car("BMW", "320i", 191),
            new Car("Audi", "A5", 205),
            new Car("VW", "Tiguan", 180),
            new Car("Mazda", "CX5", 164)
    );
    @Override
    public List<Car> getAllCars() {
        return carsList;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
