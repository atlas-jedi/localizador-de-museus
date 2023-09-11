package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
import java.util.Optional;
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
  
  private Boolean checkCoordinate(Coordinate coordinate) {
    return CoordinateUtil.isCoordinateValid(coordinate);
  }

  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {
    Optional<Museum> closestMuseum = database.getClosestMuseum(coordinate, maxDistance);
    if (!checkCoordinate(coordinate)) {
      throw new InvalidCoordinateException();
    }

    if (closestMuseum.isEmpty()) {
      throw new MuseumNotFoundException();
    }
    return closestMuseum.get();
  }

  /**
   * Create a Museum object.
   */
  @Override
  public Museum createMuseum(Museum museum) {
    if (checkCoordinate(museum.getCoordinate())) {
      return database.saveMuseum(museum);
    }
    throw new InvalidCoordinateException();
  }

  @Override
  public Museum getMuseum(Long id) {
    return new Museum();
  }
}
