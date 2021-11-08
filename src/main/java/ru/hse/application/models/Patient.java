package ru.hse.application.models;

import java.sql.Timestamp;
import java.util.List;

public class Patient extends Person {

    private Integer hospitalId;
    private String medicalInsuranse;
    private List<Integer> passport;

    public Patient(String name, String surname, Timestamp birthday,
                   Integer hospitalId, String medicalInsuranse, List<Integer> passport) {
        super(name, surname, birthday);
        this.hospitalId = hospitalId;
        this.medicalInsuranse = medicalInsuranse;
        this.passport = passport;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getMedicalInsuranse() {
        return medicalInsuranse;
    }

    public void setMedicalInsuranse(String medicalInsuranse) {
        this.medicalInsuranse = medicalInsuranse;
    }

    public List<Integer> getPassport() {
        return passport;
    }

    public void setPassport(List<Integer> passport) {
        this.passport = passport;
    }
}
