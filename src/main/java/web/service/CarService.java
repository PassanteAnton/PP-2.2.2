package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarService {

    public List<Car> getCars(List<Car> carList, int count){
        if(count > 5 ) count = 5;
        return carList.subList(0, count);
    }
}
