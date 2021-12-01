package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getAllCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car((long) 1,"Nissan", "Tiida"));
        list.add(new Car((long)2,"Toyota", "Corolla"));
        list.add(new Car((long)3, "Toyota", "MarkII"));
        list.add(new Car((long)4, "Tesla", "3"));
        list.add(new Car((long)5,"Volkswagen", "Tiguan"));
        return list;
    }
}
