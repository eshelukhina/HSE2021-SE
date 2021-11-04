package ru.hse.application.data;

import ru.hse.application.models.Doctor;

import java.util.HashMap;
import java.util.Map;

public class DoctorDatabase {
    private static final Map<Integer, Doctor> data = new HashMap<>();

    public static Integer addDoctor(Doctor doctor) {
        Integer nextId = data.size();
        data.put(nextId, doctor);
        return nextId;
    }

    public static Doctor getDoctorById(Integer id) throws IllegalArgumentException {
        if (!data.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        return data.get(id);
    }

    public static void clear() {
        data.clear();
    }
}
