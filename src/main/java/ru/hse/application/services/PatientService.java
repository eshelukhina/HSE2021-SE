package ru.hse.application.services;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

import ru.hse.application.data.PatientDatabase;
import ru.hse.application.models.Patient;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatientService {
    private final static Pattern pattern = Pattern.compile("^[a-z A-Z]+$");

    public static Integer addPatient(Patient patient) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }

    public static Boolean checkPatientName(String name, String surname) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }
}
