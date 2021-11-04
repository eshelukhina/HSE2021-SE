package ru.hse.application.data;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import ru.hse.application.models.Patient;

import java.util.HashMap;
import java.util.Map;

public class PatientDatabase {
    private static final Map<Integer, Patient> data = new HashMap<>();

    public static Integer addPatient(Patient patient) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }

    public static void clear() throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }
}
