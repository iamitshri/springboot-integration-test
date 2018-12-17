package com.amit.katas.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class IntegrationApplicationTests {


    @Autowired MockMvc mvc;

    @Test
    public void contextLoads() throws Exception {
        log.debug("state");
        RequestBuilder RequestBuilder = get("/findAll");
        mvc.perform(RequestBuilder)
           .andExpect(status().isOk());
    }

}

