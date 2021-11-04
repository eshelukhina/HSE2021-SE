package ru.hse.application;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import org.junit.jupiter.api.Test;
import ru.hse.application.models.Patient;
import ru.hse.application.services.PatientService;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {
    public void clear() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    @Test
    public void testBasicAddPatient() throws NotImplementedException {
        clear();
        String name = "Mark";
        String surname = "Vazowski";
        Timestamp birthday = Timestamp.valueOf("1974-04-13 00:00:00");
        Integer hospitalid = 42;
        String medicalInsurance = "123456789000000000";
        List<Integer> passport = List.of(0, 1);
        Patient new_patient = new Patient(name, surname, birthday, hospitalid, medicalInsurance, passport);

        assertEquals(new_patient.getName(), name);
        assertEquals(new_patient.getSurname(), surname);
        assertEquals(new_patient.getBirthday(), birthday);
        assertEquals(new_patient.getHospitalId(), hospitalid);
        assertEquals(new_patient.getMedicalInsuranse(), medicalInsurance);
        assertEquals(new_patient.getPassport(), passport);
    }

    @Test
    public void testAddPatientIncorrectName() throws NotImplementedException {
        clear();
        Patient newPatient = new Patient("Doctor?", "Smith", Timestamp.valueOf("1934-12-24 00:00:00"),
                24, "123456789000000", List.of(1, 0));
        assertThrows(
                IllegalArgumentException.class,
                () -> PatientService.addPatient(newPatient)
        );
    }
}
