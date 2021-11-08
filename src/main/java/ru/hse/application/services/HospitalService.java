package ru.hse.application.services;

import ru.hse.application.data.HospitalDatabase;
import ru.hse.application.models.Hospital;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HospitalService {
    private final static Pattern pattern = Pattern.compile("^[a-z A-Z1-9]+$");

    public static Integer addHospital(Hospital hospital) {
        if (!checkHospitalName(hospital.getName())) {
            throw new IllegalArgumentException();
        }
        return HospitalDatabase.addHospital(hospital);
    }

    public static Optional<Hospital> getHospitalById(Integer id) {
        return HospitalDatabase.getHospitalById(id);
    }

    public static Optional<List<Hospital>> getHospitals(String hospitalName) {
        return HospitalDatabase.getHospitals(hospitalName);
    }

    public static void addDoctor(Integer doctor_id, Integer hospital_id) {
        HospitalDatabase.addDoctor(doctor_id, hospital_id);
    }

    public static boolean checkHospitalName(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
