package ru.hse.application.services;

import ru.hse.application.data.DoctorDatabase;
import ru.hse.application.models.Doctor;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoctorService {
    private final static Pattern pattern = Pattern.compile("^[a-z A-Z]+$");

    public static Integer addDoctor(Doctor doctor) throws IllegalArgumentException {
        if (checkDoctorName(doctor.getName())) {
            return DoctorDatabase.addDoctor(doctor);
        }
        throw new IllegalArgumentException("Not a valid doctor's name");
    }

    public static Doctor getDoctorById(Integer id) throws IllegalArgumentException {
        return DoctorDatabase.getDoctorById(id);
    }

    public static Optional<Doctor> getDoctor(String name, String surname) {
        return DoctorDatabase.getDoctor(name, surname);
    }

    public static Boolean checkDoctorName(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static Boolean checkPatient(Integer doctor_id, Integer patient_id) throws IllegalArgumentException {
        return getDoctorById(doctor_id).getPatientIds().contains(patient_id);
    }
}
