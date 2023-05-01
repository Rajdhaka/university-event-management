package com.geekster.universityEventManagement.controllers;

import com.geekster.universityEventManagement.models.Department;
import com.geekster.universityEventManagement.models.Event;
import com.geekster.universityEventManagement.models.Student;
import com.geekster.universityEventManagement.services.EventService;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping(value = "/events/all")
    public Iterable<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping(value = "/events/date/{date}")
    public List<Event> getStudentByDate(@PathVariable LocalDate date) {
        return eventService.getEventsByDate(date);
    }


    @PostMapping(value = "/events")
    public String addEvent(@RequestBody List<Event>events) {
        return eventService.addEvents(events);
    }

    @PutMapping(value = "/event/{eventId}/{date}")
    public  void updateEventById(@Valid @PathVariable Integer eventId,@PathVariable LocalDate date){
        eventService.updateEventById(eventId,date);
    }
    @DeleteMapping(value = "/event/delete/{eventId}")
    public void deleteEventById(@PathVariable Integer eventId) {
        eventService.deleteEventById(eventId);
    }

}
