//package com.thoughtworks.ttauction.service;
//
//
//import com.thoughtworks.ttauction.entity.Car;
//import com.thoughtworks.ttauction.repository.CarDao;
//import com.thoughtworks.ttauction.service.CarServiceImpl.java.CarServiceImpl;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//@Rollback(true)
//public class CarServiceTest {
//
//    @Mock
//    private CarDao carDAO;
//
//    @Mock
//    private List<Car> listOfCars = new ArrayList<>();
//
//    @InjectMocks
//    private CarService carService = new CarServiceImpl();
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void testAddCar() throws Exception {
//        doNothing().when(carDAO).addCar(any(Car.class));
//        carService.addCar(any(Car.class));
//        verify(carDAO, atLeastOnce()).addCar(any(Car.class));
//    }
//
//    @Test
//    public void testGetAllCars() throws Exception {
//        when(carDAO.getCars()).thenReturn(listOfCars);
//
//        Assert.assertEquals(carService.getCars(), listOfCars);
//        carService.getCars();
//
//        verify(carDAO, atLeastOnce()).getCars();
//    }
//
//    @Test
//    public void testGetCarById() throws Exception {
//        Car car = listOfCars.get(0);
//
//        when(carDAO.getCarById(anyInt())).thenReturn(car);
//
//        Assert.assertEquals(carService.getCarById(1), car);
//
//        verify(carDAO, atLeastOnce()).getCarById(anyInt());
//    }
//}
