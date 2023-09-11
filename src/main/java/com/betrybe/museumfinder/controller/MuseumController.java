package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Museum controller class.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {
  private final MuseumServiceInterface museumService;

  @Autowired
  MuseumController(MuseumServiceInterface museumService) {
    this.museumService = museumService;
  }

  @PostMapping
  public ResponseEntity<Museum> createMuseum(@RequestBody Museum museum) {
    this.museumService.createMuseum(museum);
    return ResponseEntity.status(HttpStatus.CREATED).body(museum);
  }

  /**
   * Retorna as informações do museu mais próximo com base na latitude,
   * longitude e na distância máxima especificada em quilômetros.
   */
  @GetMapping("/closest")
  public ResponseEntity<Museum> closestMuseum(
      @RequestParam Double lat, Double lng,
      @RequestParam("max_dist_km") Double maxDistanceKm
  ) {
    Coordinate coordinate = new Coordinate(lat, lng);
    Museum closestMuseum = this.museumService.getClosestMuseum(coordinate, maxDistanceKm);
    if (closestMuseum != null) {
      return ResponseEntity.status(HttpStatus.OK).body(closestMuseum);
    }

    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
  }
}
