package com.betrybe.museumfinder.exception;

/**
 * Classe de exceção para Coordinate.
 */
public class InvalidCoordinateException extends RuntimeException {
  public InvalidCoordinateException(String message) {
    super(message);
  }
}
