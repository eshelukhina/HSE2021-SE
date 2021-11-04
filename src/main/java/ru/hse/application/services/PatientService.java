package ru.hse.application.services;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

import ru.hse.application.data.PatientDatabase;
import ru.hse.application.models.Patient;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatientService {
    private final static Pattern pattern = Pattern.compile("^[a-z A-Z]+$");

    public static Integer addPatient(Patient patient) {
        if (checkPatientName(patient.getName(), patient.getSurname())) {
            return PatientDatabase.addPatient(patient);
        }
        throw new IllegalArgumentException("Not a valid patient's name");
    }

    public static Boolean checkPatientName(String name, String surname) {
        Matcher matcher_name = pattern.matcher(name);
        Matcher matcher_surname = pattern.matcher(surname);
        return matcher_name.matches() && matcher_surname.matches();
    }

    public static Patient getPatientById(Integer id) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet.");
    }
}
