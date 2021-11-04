package ru.hse.application.services;

import jdk.jshell.spi.ExecutionControl;
import ru.hse.application.models.Doctor;
import ru.hse.application.models.Hospital;
import ru.hse.application.models.Visit;

import java.util.HashMap;
import java.util.Map;

public class VisitService {
    private static final Map<Integer, Visit> data = new HashMap<>();

    public static Integer addVisit(Visit visit) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented yet.");
    }

    private boolean checkDoctor(Doctor doctor) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented yet.");
    }

    private boolean checkHospital(Hospital hospital) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not implemented yet.");
    }
}
