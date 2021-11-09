package ru.hse.application.data;

import ru.hse.application.models.Doctor;

import java.util.*;

public class DoctorDatabase {
    private static final Map<Integer, Doctor> data = new HashMap<>();

    public static Integer addDoctor(Doctor doctor) {
        Integer nextId = data.size();
        data.put(nextId, doctor);
        doctor.setId(nextId);
        return nextId;
    }

    public static Optional<Doctor> getDoctorById(Integer id) throws IllegalArgumentException {
        if (!data.containsKey(id)) {
            return Optional.empty();
        }
        return Optional.of(data.get(id));
    }

    public static Optional<List<Doctor>> getDoctors(String name, String surname) {
        List<Doctor> result = new LinkedList<>();
        for (Doctor doctor : data.values()){
            if (name.equals(doctor.getName()) && surname.equals(doctor.getSurname())){
                result.add(doctor);
            }
        }
        if (result.isEmpty()) return Optional.empty();
        return Optional.of(result);
    }

    public static void clear() {
        data.clear();
    }
}
