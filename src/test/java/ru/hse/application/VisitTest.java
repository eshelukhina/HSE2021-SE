package ru.hse.application;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

import org.junit.jupiter.api.Test;
import ru.hse.application.models.Patient;
import ru.hse.application.models.Visit;
import ru.hse.application.models.Doctor;
import ru.hse.application.models.Hospital;
import ru.hse.application.services.DoctorService;
import ru.hse.application.services.HospitalService;
import ru.hse.application.services.PatientService;
import ru.hse.application.services.VisitService;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VisitTest {

    @Test
    public void testBasicAddVisit() {
        Doctor doctor = new Doctor("Jack", "Vorobey", Timestamp.valueOf("2001-09-03 00:00:00"),
                "pediatrician", "boss of the gym", List.of(1, 2, 3));
        Timestamp date = Timestamp.valueOf("2021-11-13 14:00:00");
        Hospital hospital = new Hospital("name", "address", List.of());
        String info = "Some info";
        Boolean status = false;

        Visit visit = new Visit(doctor, hospital, date, info, status);

        assertEquals(visit.getDoctor(), doctor);
        assertEquals(visit.getHospital(), hospital);
        assertEquals(visit.getDate(), date);
        assertEquals(visit.getInfo(), info);
        assertEquals(visit.getStatus(), status);
    }

    @Test
    public void testAddVisitIncorrectName() throws NotImplementedException {
        Doctor doctor = new Doctor("Jack", "Vorobey", Timestamp.valueOf("2001-09-03 00:00:00"),
                "pediatrician", "boss of the gym", List.of(1));
        DoctorService.addDoctor(doctor);
        Hospital hospital = new Hospital("name", "address", List.of());

        Visit visit = new Visit(doctor, hospital,
                Timestamp.valueOf("2021-09-03 12:00:00"), "info", false);


        assertThrows(
                IllegalArgumentException.class,
                () -> VisitService.addVisit(visit)
        );
    }

}
