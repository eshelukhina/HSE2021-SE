package ru.hse.application.data;

import ru.hse.application.models.Hospital;

import java.util.*;

public class HospitalDatabase {
    private static Map<Integer, Hospital> data = new HashMap<>();

    public static Integer addHospital(Hospital hospital) {
        Integer id = data.size();
        hospital.setId(id);
        data.put(id, hospital);
        return id;
    }

    public static Optional<Hospital> getHospitalById(Integer id) {
        if (!data.containsKey(id)) {
            return Optional.empty();
        }
        return Optional.of(data.get(id));
    }

    public static void addDoctor(Integer doctorId, Integer hospitalId) throws IllegalArgumentException {
        if (!data.containsKey(hospitalId)) {
            throw new IllegalArgumentException();
        }
        data.get(hospitalId).getDoctorIds().add(doctorId);
    }

    public static Optional<List<Hospital>> getHospitals(String hospitalName) {
        List<Hospital> result = new LinkedList<>();
        for (Hospital hospital :data.values()) {
            if (hospitalName.equals(hospital.getName())){
                result.add(hospital);
            }
        }
        if (result.isEmpty()) return Optional.empty();
        return Optional.of(result);
    }

    public static void clear(){
        data.clear();
    }
}
