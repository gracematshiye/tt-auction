package com.thoughtworks.ttauction.service;


import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.repository.CarDao;
import com.thoughtworks.ttauction.service.impl.CarServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CarServiceTest {

    @Mock
    private CarDao carDAO;

    @Mock
    private List<Car> listOfCars = new ArrayList<Car>();

    @InjectMocks
    private CarService carService = new CarServiceImpl();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllCars() throws Exception {

        listOfCars.add(new Car());
        when(carDAO.getCars()).thenReturn(listOfCars);

        Assert.assertEquals(carService.getCars(), listOfCars);

        verify(carDAO, atLeastOnce()).getCars();
    }
}
