package web.service;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    List<Car> getCars(@RequestParam(value = "count", required = false) Integer count);
}
