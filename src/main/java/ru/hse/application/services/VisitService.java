package ru.hse.application.services;

import ru.hse.application.data.DoctorDatabase;
import ru.hse.application.data.HospitalDatabase;
import ru.hse.application.data.VisitDatabase;
import ru.hse.application.models.Doctor;
import ru.hse.application.models.Hospital;
import ru.hse.application.models.Visit;

import java.util.HashMap;
import java.util.Map;

public class VisitService {
    private static final Map<Integer, Visit> data = new HashMap<>();

    public static void addVisit(Visit visit) {
        if (checkDoctor(visit.getDoctor()) && checkHospital(visit.getHospital())) {
            VisitDatabase.addVisit(visit);
            return;
        }
        throw new IllegalArgumentException("Not a valid visit's doctor or hospital");
    }

    private static boolean checkDoctor(Doctor doctor) {
        try {
            DoctorDatabase.getDoctorById(doctor.getId());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static boolean checkHospital(Hospital hospital) {
        try {
            HospitalDatabase.getHospitalById(hospital.getId());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
