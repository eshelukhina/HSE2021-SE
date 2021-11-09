package ru.hse.application.services;

import ru.hse.application.data.DoctorDatabase;
import ru.hse.application.models.Doctor;

import java.util.List;
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

    public static Optional<Doctor> getDoctorById(Integer id) {
        return DoctorDatabase.getDoctorById(id);
    }

    public static Optional<List<Doctor>> getDoctors(String name, String surname) {
        return DoctorDatabase.getDoctors(name, surname);
    }

    public static Boolean checkDoctorName(String name) {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static Boolean checkPatient(Integer doctor_id, Integer patient_id) throws IllegalArgumentException {
        var doctor = getDoctorById(doctor_id);
        if (doctor.isEmpty()) throw new IllegalArgumentException();
        return doctor.get().getPatientIds().contains(patient_id);
    }
}
