//package com.thoughtworks.ttauction.controller;
//
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
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class TestGetCarById {
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
//        car = new Car("Model name 1", "Make name 1", 27712, 2016, new BigDecimal(120000), "Condition 1", "Color 1", "Transmission 1", "Fuel type 1", "Description 1", new BigDecimal(100000), true);
//
//        when(carService.getCarById(1)).thenReturn(car);
//    }
//
//    @Test
//    public void shouldReturnCarById() throws Exception {
//        carService.getCarById(1);
//        verify(carService, times(1)).getCarById(1);
//    }
//
//    @Test
//    public void testDisplayMethodIsCalled() throws Exception {  // from displayAll method
//        String viewName = controller.displayACar(new Integer(1), new ModelMap());
//        Assert.assertEquals("single-car", viewName);
//    }
//
//
//    @Test
//    public void testVerifyTheHTTPStatusIsOkay() throws Exception {
//        mockMvc.perform(get("/cars/1"))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void testCarListAttributeExists() throws Exception {
//        mockMvc.perform(get("/cars/1"))
//                .andExpect(model().attribute("car", this.carService.getCarById(1)));
//    }
//}
