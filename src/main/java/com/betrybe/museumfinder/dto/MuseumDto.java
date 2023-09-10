package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * Record representing a Museum.
 */
public record MuseumDto(
    Long id, String name, String description,
    String address, String collectionType, String subject,
    String url, Coordinate coordinate
) {
  
}
