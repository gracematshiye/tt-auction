package com.thoughtworks.ttauction.controller;


import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.service.CarService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class CarControllerTest {

    private MockMvc mockMvc;

    @Mock
    private CarService carService ;

    @InjectMocks
    private CarController controller;


    List<Car> listOfCars = new ArrayList<>();
    Car firstCar = new Car();

    @Before
    public void setUp() throws Exception {

        controller  = new CarController();

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/views");

        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setViewResolvers(viewResolver)
                .build();

        listOfCars.add(firstCar);
        when(carService.getCars()).thenReturn(listOfCars);

    }

    @Test
    public void verifyThatTheViewNameIsHomePage() throws Exception {

        mockMvc.perform(get("/cars"))
                .andExpect(view().name("all-cars"));
    }

    @Test
    public void verifyTheHTTPStatusIsOkay() throws Exception {

        mockMvc.perform(get("/cars"))
                .andExpect(status().isOk());

    }

    @Test
    public void verifyGetListOfCarsMethodFromServiceIsCalled() throws Exception {
        Assert.assertEquals(listOfCars, carService.getCars());
        verify(carService, times(1)).getCars();
    }

    @Test
    public void verifyCarsAttributeExists() throws Exception {
        mockMvc.perform(get("/cars"))
                .andExpect(model().attributeExists("carList"));
    }

    @Test
    public void verifyListOfCaraHasOneElement()throws Exception {

        mockMvc.perform(get("/cars"))
                .andExpect(model().attribute("carList", hasSize(1)));

    }

}
