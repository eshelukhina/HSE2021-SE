package ru.hse.application.services;

import ru.hse.application.data.HospitalDatabase;
import ru.hse.application.models.Hospital;

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

    public static Hospital getHospitalById(Integer id) {
        return HospitalDatabase.getHospitalById(id);
    }

    public static boolean checkHospitalName(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
