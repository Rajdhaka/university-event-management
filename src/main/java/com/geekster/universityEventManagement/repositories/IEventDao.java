package com.geekster.universityEventManagement.repositories;

import com.geekster.universityEventManagement.models.Event;
import com.geekster.universityEventManagement.models.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IEventDao extends CrudRepository<Event,Integer> {
    List<Event> findByDate(LocalDate date);

    @Modifying
    @Query(value = "update Event Set DATE =:eventDate where EVENT_ID =:eventId",nativeQuery = true)
    void updateEventDateByEventId(Integer eventId,LocalDate eventDate);


}
