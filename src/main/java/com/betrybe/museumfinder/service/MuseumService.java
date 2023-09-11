package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
import org.springframework.stereotype.Service;

/**
 * Museum service class.
 */
@Service
public class MuseumService implements MuseumServiceInterface {
  MuseumFakeDatabase database;

  public MuseumService(MuseumFakeDatabase database) {
    this.database = database;
  }
  
  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {
    return new Museum();
  }

  /**
   * Create a Museum object.
   */
  @Override
  public Museum createMuseum(Museum museum) {
    if (CoordinateUtil.isCoordinateValid(museum.getCoordinate())) {
      return database.saveMuseum(museum);
    }
    throw new InvalidCoordinateException("Coordenadas inválidas!");
  }

  @Override
  public Museum getMuseum(Long id) {
    return new Museum();
  }
}
