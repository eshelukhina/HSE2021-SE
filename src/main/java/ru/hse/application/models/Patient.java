package ru.hse.application.models;

import java.sql.Timestamp;

public class Patient extends Person {

    private Integer hospitalId;
    private Integer medicalInsuranse;
    private Integer passport;

    public Patient(String name, String surname, Timestamp birthday,
                   Integer hospitalId, Integer medicalInsuranse, Integer passport) {
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

    public Integer getMedicalInsuranse() {
        return medicalInsuranse;
    }

    public void setMedicalInsuranse(Integer medicalInsuranse) {
        this.medicalInsuranse = medicalInsuranse;
    }

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }
}
