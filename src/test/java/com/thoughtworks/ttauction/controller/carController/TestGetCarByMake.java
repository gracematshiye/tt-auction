//package com.thoughtworks.ttauction.controller.carController;
//
//import com.thoughtworks.ttauction.controller.CarController;
//import com.thoughtworks.ttauction.entity.Car;
//import com.thoughtworks.ttauction.service.CarService;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class TestGetCarByMake {
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private CarService carService ;
//
//    @InjectMocks
//    private CarController controller;
//
//    private List<Car> listOfCars = new ArrayList<>();
//
//    private Car car;
//
//    @Before
//    public void setUp() throws Exception {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setPrefix("/WEB-INF/views");
//
//        MockitoAnnotations.initMocks(this);
//
//        mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .setViewResolvers(viewResolver)
//                .build();
//
//        car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000));
//
//        listOfCars.add(car);
//
//        when(carService.getCars()).thenReturn(listOfCars);
//    }
//
//    @Test
//    public void testDisplayMethodIsCalled() throws Exception {  // from displayAll method
//        String viewName = controller.displayCarMake(new String(), new ModelMap());
//        Assert.assertEquals("all-cars", viewName);
//    }
//
//
//    @Test
//    public void testVerifyTheHTTPStatusIsOkay() throws Exception {
//        mockMvc.perform(get("/cars/make=Make name 1"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void testCarListAttributeExists() throws Exception {
//
//        List<Car> selectMake = this.carService.getCars();
//        selectMake.add(car);
//
//        mockMvc.perform(get("/cars/make=Make name 1"))
//                .andExpect(model().attribute("carList", selectMake));
//    }
//}
