# University Event Management

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `Spring Boot 3.0.5(Framwork)`
* `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:
 1. ### Models: 
    Created two Classes first is Student class along with properties like studentId, firstName, lastName, age, department and second class Event along with properties like eventId, eventName, locationOfEvent, date, startTime, endTime  and create a constructors, and getters and setters both of the classes.Using some validation with properties like @Id, @Pattern etc.
 1. ### Controllers: 
    *  Created two controller class StudentController and EventController class in which having mapping like @GetMapping,
    @PostMapping,@PutMapping,@DeleteMapping.Created  objects of StudentService class and EventService  through dependency injection using @Autowired annotation.

    #### API Reference:
    * Get all Students:

      ```http://localhost:8080/students/all```

    * Get Student By Id:

      ```http://localhost:8080/student/id/{id}```  


    * Add Student:

      ```http://localhost:8080/student/add```

    * Add Students:

      ```http://localhost:8080/students/add```


    * Update Student department By id:

      ```http://localhost:8080/student/{id}/{department}```

    * Delete Student By Id:

      ```http://localhost:8080/student/delete/id/{id}```

    * Delete Student By Age:

      ```http://localhost:8080/students/delete/age/{age}```

    * Get all Events:

      ```http://localhost:8080/events/all```

    * Get Events By Date:

      ```http://localhost:8080/events/date/{date}```  


    * Add Events:

      ```http://localhost:8080/events```


    * Update Event Date By id:

      ```http://localhost:8080/event/{id}/{date}```

    * Delete Event By Id:

      ```http://localhost:8080/event/delete/{id}```

 1. ### Services: 
    * It consist StudentService class and EventService class  in which having some buisness logic.
    * @Service annotation is used to make the class as a service layer.

 1. ### Repositories:
    * Created StudentDao Inteface and EventDao Interface that extents CrudRepository interface so we can use inbuilt crudRepo method and we create some cusom finder method and writting some query method to perform crud operation like create ,read, update and delete.

## Project Summary
In this spring boot application I had created API's mapping for CRUD operations like create(save), read(find), update and delete student and event. Aim of this project to using some validation, using the crudRepository method , createing and using custom finder method and custom query method in this project.