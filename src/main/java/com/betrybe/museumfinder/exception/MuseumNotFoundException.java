package com.betrybe.museumfinder.exception;

/**
 * Classe de exceção para Museum.
 */
public class MuseumNotFoundException extends RuntimeException {
  public MuseumNotFoundException(String message) {
    super(message);
  }
}
