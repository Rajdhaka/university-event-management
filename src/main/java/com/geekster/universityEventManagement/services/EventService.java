package com.geekster.universityEventManagement.services;

import com.geekster.universityEventManagement.models.Event;
import com.geekster.universityEventManagement.models.Student;
import com.geekster.universityEventManagement.repositories.IEventDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class EventService {
    @Autowired
    IEventDao eventDao;
    public Iterable<Event> getAllEvents(){
        return eventDao.findAll();
    }

    public List<Event> getEventsByDate(LocalDate date) {
        return eventDao.findByDate(date);
    }

    public String addEvents(List<Event>events) {
         Iterable<Event>addedEvents = eventDao.saveAll(events);
        if(addedEvents != null){
            return "Yes";
        }
        return "No";
    }
    @Transactional
    public void updateEventById(Integer eventId,LocalDate date){
        eventDao.updateEventDateByEventId(eventId,date);
    }

    public void deleteEventById(Integer eventId) {
       eventDao.deleteById(eventId);
    }
}
