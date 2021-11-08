package ru.hse.application.data;

import ru.hse.application.models.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DoctorDatabase {
    private static final Map<Integer, Doctor> data = new HashMap<>();

    public static Integer addDoctor(Doctor doctor) {
        Integer nextId = data.size();
        data.put(nextId, doctor);
        doctor.setId(nextId);
        return nextId;
    }

    public static Doctor getDoctorById(Integer id) throws IllegalArgumentException {
        if (!data.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        return data.get(id);
    }

    public static Optional<Doctor> getDoctor(String name, String surname) {
        for (Doctor doctor : data.values()){
            if (name.equals(doctor.getName()) && surname.equals(doctor.getSurname())){
                return Optional.of(doctor);
            }
        }
        return Optional.empty();
    }

    public static void clear() {
        data.clear();
    }
}
