package ru.hse.application.data;

import ru.hse.application.models.Hospital;

import java.util.HashMap;
import java.util.Map;

public class HospitalDatabase {
    private static Map<Integer, Hospital> data = new HashMap<>();

    public static Integer addHospital(Hospital hospital) {
        Integer id = data.size();
        data.put(id, hospital);
        return id;
    }

    public static Hospital getHospitalById(Integer id) {
        if (!data.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        return data.get(id);
    }
}
