package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao){
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        List<Car> cars = carDao.getAllCars();
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
