DROP DATABASE IF EXISTS Java2Campus2;
CREATE DATABASE IF NOT EXISTS Java2Campus2 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE Java2Campus2;

DROP TABLE IF EXISTS CAMPUS;
CREATE TABLE CAMPUS
(
	CampusID int NOT NULL AUTO_INCREMENT,
	CampusTitle enum () NOT NULL,
	GeoLocation float NOT NULL,
	Address varchar (100) NOT NULL,
	ZIP varchar (5) NULL,
	Faculties int NULL,
	
	CONSTRAINT Campus_pk PRIMARY KEY (CampusID)
);

DROP TABLE IF EXISTS FACULTY;
CREATE TABLE FACULTY
(
	FacultyID int NOT NULL AUTO_INCREMENT,
	FacultyTitle enum () NOT NULL,
	ShortTitle varchar (5) NOT NULL,
	Campus int NULL,
	
	CONSTRAINT Faculty_pk PRIMARY KEY (FacultyID)
);

DROP TABLE IF EXISTS CAMPUSTOFACULTY;
CREATE TABLE CAMPUSTOFACULTY
(
	CampusFacultyID int NOT NULL AUTO_INCREMENT,
	CampusID int NOT NULL,
	FacultyID int NOT NULL,
	
	CONSTRAINT CampusFaculty_pk PRIMARY KEY (CampusFacultyID),
	CONSTRAINT CampusToFaculty_Faculty FOREIGN KEY (FacultyID) REFERENCES FACULTY(FacultyID),
	CONSTRAINT CampusToFaculty_Campus FOREIGN KEY (CampusID) REFERENCES CAMPUS(CampusID)
);

DROP TABLE IF EXISTS BUILDING;
CREATE TABLE BUILDING
(
	BuildingID int NOT NULL AUTO_INCREMENT,
	BuildingTitle varchar(50) NOT NULL,
	CampusID int NOT NULL,
	Accessibility tinyint NOT NULL,
	GeoLocation float NOT NULL,
	Dorm tinyint NOT NULL,
	
	CONSTRAINT Building_pk PRIMARY KEY (BuildingID),
	CONSTRAINT Building_Campus_fk FOREIGN KEY (CampusID) REFERENCES CAMPUS(CampusID)
);

DROP TABLE IF EXISTS ROOM;
CREATE TABLE ROOM
(
	RoomID int NOT NULL AUTO_INCREMENT,
	RoomTitle varchar(50) NOT NULL,
	BuildingID int NOT NULL,
	RoomFloor int NOT NULL,
	RoomType enum() NOT NULL,
	
	CONSTRAINT Room_pk PRIMARY KEY (RoomID),
	CONSTRAINT Room_Building_fk FOREIGN KEY (BuildingID) REFERENCES BUILDING(BuildingID)
);

DROP TABLE IF EXISTS EVENTS;
CREATE TABLE EVENTS
(
	EventID int NOT NULL AUTO_INCREMENT,
	EventType enum() NOT NULL,
	
	CONSTRAINT Event_pk PRIMARY KEY (EventID)
);

DROP TABLE IF EXISTS EVENTSTOROOM,
CREATE TABLE EVENTSTOROOM
(
	EventsToRoomID int NOT NULL AUTO_INCREMENT,
	EventID int NOT NULL,
	RoomID int Not NULL,
	
	CONSTRAINT EventsToRoom_pk PRIMARY KEY (EventsToRoomID),
	CONSTRAINT EventsToRoom_Events_fk FOREIGN KEY (EventID) REFERENCES EVENTS(EventID),
	CONSTRAINT EventsToRoom_Room_fk FOREIGN KEY (RoomID) REFERENCES ROOM(RoomID)
);

DROP TABLE IF EXISTS PERSON;
CREATE TABLE PERSON
(
	PersonsID int NOT NULL AUTO_INCREMENT,
	AcademicTitle varchar(50) NULL,
	FirstName varchar(50) NOT NULL,
	LastName varchar(50) NOT NULL,
	RoomID int NOT NULL,
	
	CONSTRAINT Person_pk PRIMARY KEY (PersonID),
	CONSTRAINT Person_Room_fk FOREIGN KEY (RoomID) REFERENCES ROOM(RoomID)
)