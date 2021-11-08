package ru.hse.application.models;

import java.sql.Timestamp;

public class Visit {

    private Integer id;
    private Doctor doctor;
    private Hospital hospital;
    private Timestamp date;
    private String info;
    private Boolean status;

    public Visit(Doctor doctor, Hospital hospital,
                 Timestamp date, String info, Boolean status) {
        this.doctor = doctor;
        this.hospital = hospital;
        this.date = date;
        this.info = info;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Timestamp getDate() {
        return this.date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
