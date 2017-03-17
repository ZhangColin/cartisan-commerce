package com.cartisan.commerce.integrationtest.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {
    @Test
    public void indexIntegrationTest() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/")).andExpect(view().name("/home"));
    }

    @Test
    public void indexUnitTest() {
        // Arrange
        HomeController controller = new HomeController();

        // Act
        String viewName = controller.index();

        // Assert
        assertThat(viewName).isEqualTo("/home");
    }

}