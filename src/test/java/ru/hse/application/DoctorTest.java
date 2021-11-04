package ru.hse.application;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import org.junit.jupiter.api.Test;
import ru.hse.application.models.Doctor;
import ru.hse.application.models.Hospital;
import ru.hse.application.services.DoctorService;
import ru.hse.application.services.HospitalService;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {
    public void clear() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    @Test
    public void testBasicAddDoctor() throws NotImplementedException {
        clear();
        Doctor expected_doctor = new Doctor("Jack", "Vorobey", Timestamp.valueOf("2001-09-03 00:00:00"),
                "pediatrician", "boss of the gym", List.of(1, 2, 3));
        Integer id = DoctorService.addDoctor(expected_doctor);
        Doctor doctor = DoctorService.getDoctorById(id);
        assertNotNull(doctor);

        assertEquals(expected_doctor.getName(), doctor.getName());
        assertEquals(expected_doctor.getSurname(), doctor.getSurname());
        assertEquals(expected_doctor.getBirthday(), doctor.getBirthday());
        assertEquals(expected_doctor.getSpecialization(), doctor.getSpecialization());
        assertEquals(expected_doctor.getPosition(), doctor.getPosition());
        assertEquals(expected_doctor.getPatientIds(), doctor.getPatientIds());
    }

    @Test
    public void testAddDoctorIncorrectName() throws NotImplementedException {
        clear();
        Doctor doctor = new Doctor("Пашка", "Эгипти", Timestamp.valueOf("2001-09-03 00:00:00"),
                "pediatrician", "boss of the gym", List.of(1));
        assertThrows(
                IllegalArgumentException.class,
                () -> DoctorService.addDoctor(doctor)
        );
    }

    @Test
    public void testCheckPatientBasic() throws NotImplementedException {
        clear();
        Doctor expected_doctor = new Doctor("Jack", "Vorobey", Timestamp.valueOf("2001-09-03 00:00:00"),
                "pediatrician", "boss of the gym", List.of(1));
        Integer doctor_id = DoctorService.addDoctor(expected_doctor);
        assertTrue(DoctorService.checkPatient(doctor_id, 1));
        assertFalse(DoctorService.checkPatient(doctor_id, 2));
    }
}
