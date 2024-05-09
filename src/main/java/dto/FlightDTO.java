package dto;


import dao.entity.FlightEntity;

import java.time.LocalDateTime;
import java.util.Objects;

public class FlightDTO {
    public static long MAX_ID = 0;
    private long id;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private int numOfSeats;

    public FlightDTO(String origin, String destination, LocalDateTime departureTime, int numOfSeats) {
        this.id = ++MAX_ID;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.numOfSeats = numOfSeats;
    }

    public FlightDTO() {
    }

    public FlightDTO(long id, String origin, String destination, LocalDateTime departureTime, int numOfSeats) {
        this.origin = origin;
        this.id = id;
        this.destination = destination;
        this.departureTime = departureTime;
        this.numOfSeats = numOfSeats;
    }

    public long getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDTO that = (FlightDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("{id='%s', destination='%s', date='%s', numOfSeats=%d}", id, destination, departureTime, numOfSeats);
    }
}