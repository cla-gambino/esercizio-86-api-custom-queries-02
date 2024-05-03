package develhope.esercizio86apicustomqueries02.repositories;

import develhope.esercizio86apicustomqueries02.entities.Flight;
import develhope.esercizio86apicustomqueries02.entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByStatus(FlightStatus status);

    List<Flight> findByStatusIn(List<FlightStatus> statuses);
}
