package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carArrayList = new ArrayList<>();

    public CarServiceImpl() {
        carArrayList.add(new Car("merc", 220, "ultimate"));
        carArrayList.add(new Car("audi", 249, "elegant"));
        carArrayList.add(new Car("volkswagen", 150, "prime"));
        carArrayList.add(new Car("lada", 110, "comfort"));
        carArrayList.add(new Car("porsche", 550, "luxury"));
    }

    @Transactional
    @Override
    public List<Car> getAllCars() {
        return carArrayList;
    }

    @Transactional
    @Override
    public List<Car> getCars(@RequestParam(value = "count", required = false) Integer count) {
        return carArrayList.stream().limit(count).collect(Collectors.toList());
    }
}
