package ru.hse.application.data;

import ru.hse.application.models.Patient;

import java.util.HashMap;
import java.util.Map;

public class PatientDatabase {
    private static final Map<Integer, Patient> data = new HashMap<>();

    public static Integer addPatient(Patient patient)  {
        Integer nextId = data.size();
        data.put(nextId, patient);
        return nextId;
    }

    public static void clear()  {
        data.clear();
    }
}
