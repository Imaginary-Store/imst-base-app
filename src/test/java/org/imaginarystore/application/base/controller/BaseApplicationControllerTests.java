package org.imaginarystore.application.base.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BaseApplicationController.class)
class BaseApplicationControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testEntryPage() throws Exception {
        mockMvc.perform(get("/api/v1/base/entry"))
                .andExpect(status().isOk());
    }

}
