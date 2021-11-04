package ru.hse.application;

import org.junit.jupiter.api.Test;
import ru.hse.application.data.DoctorDatabase;
import ru.hse.application.models.Doctor;
import ru.hse.application.services.DoctorService;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {
    public void clear() {
        DoctorDatabase.clear();
    }

    @Test
    public void testBasicAddDoctor() {
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
    public void testAddDoctorIncorrectName() {
        clear();
        Doctor doctor = new Doctor("Пашка", "Эгипти", Timestamp.valueOf("2001-09-03 00:00:00"),
                "pediatrician", "boss of the gym", List.of(1));
        assertThrows(
                IllegalArgumentException.class,
                () -> DoctorService.addDoctor(doctor)
        );
    }

    @Test
    public void testCheckPatientBasic() {
        clear();
        Doctor expected_doctor = new Doctor("Jack", "Vorobey", Timestamp.valueOf("2001-09-03 00:00:00"),
                "pediatrician", "boss of the gym", List.of(1));
        Integer doctor_id = DoctorService.addDoctor(expected_doctor);
        assertTrue(DoctorService.checkPatient(doctor_id, 1));
        assertFalse(DoctorService.checkPatient(doctor_id, 2));
    }
}
