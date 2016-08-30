package com.thoughtworks.ttauction.controller.car;

import com.thoughtworks.ttauction.controller.CarController;
import com.thoughtworks.ttauction.entity.Car;
import com.thoughtworks.ttauction.service.CarService;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class AddCarControllerTest {
    private MockMvc mockMvc;

    @Mock
    private CarService carService ;

    @InjectMocks
    private CarController controller;

    private List<Car> listOfCars = new ArrayList<>();

    private Car car;

    @Before
    public void setUp() throws Exception {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/views");

        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setViewResolvers(viewResolver)
                .build();

        car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));

        listOfCars.add(car);

        when(carService.getCars()).thenReturn(listOfCars);
    }
}
