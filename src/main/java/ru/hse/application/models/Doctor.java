package ru.hse.application.models;

import java.sql.Timestamp;
import java.util.List;

public class Doctor extends Person{
    private String specialization;
    private String position;
    private List<Integer> patientIds;

    public Doctor(String name, String surname, Timestamp birthday,
                  String specialization, String position, List<Integer> patientIds){
        super(name, surname, birthday);
        this.specialization = specialization;
        this.position = position;
        this.patientIds = patientIds;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Integer> getPatientIds() {
        return patientIds;
    }

    public void setPatientIds(List<Integer> patientIds) {
        this.patientIds = patientIds;
    }
}
