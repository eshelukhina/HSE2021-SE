package ru.hse.application;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import org.junit.jupiter.api.Test;
import ru.hse.application.models.Patient;
import ru.hse.application.services.PatientService;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {

    @Test
    public void testBasicAddPatient() throws NotImplementedException {
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
}
