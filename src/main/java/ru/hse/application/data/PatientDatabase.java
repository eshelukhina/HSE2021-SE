package ru.hse.application.data;

import ru.hse.application.models.Patient;

import java.util.HashMap;
import java.util.Map;

public class PatientDatabase {
    private static final Map<Integer, Patient> data = new HashMap<>();

    public static Integer addPatient(Patient patient)  {
        Integer nextId = data.size();
        data.put(nextId, patient);
        patient.setId(nextId);
        return nextId;
    }

    public static Patient getPatientById(Integer id) throws IllegalArgumentException {
        if (!data.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        return data.get(id);
    }

    public static void clear()  {
        data.clear();
    }
}
