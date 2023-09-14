package com.betrybe.museumfinder.solution;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("Testes para CollectionType")
class CollectionTypeTest {
  
  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("Teste da rota /collections/count/{typesList}")
  void testCountCollection() throws Exception {
    String jsonString = "{\"collectionTypes\":[\"hist\",\"imag\"],\"count\":492}";

    this.mockMvc.perform(get("/collections/count/hist,imag"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(content().json(jsonString));
  }

  @Test
  @DisplayName("Teste das rotas /museums/")
  void testMuseums() throws Exception {
    this.mockMvc.perform(get("/museums/1"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.collectionType").value("História"));
  }
}