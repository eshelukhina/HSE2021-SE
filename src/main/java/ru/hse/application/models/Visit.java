package ru.hse.application.models;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

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

    public Integer getId() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public void setId(Integer id) throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public Doctor getDoctor() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public void setDoctor(Doctor doctor) throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public Hospital getHospital() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public void setHospital(Hospital hospital) throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public Timestamp getDate() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public void setDate(Timestamp date) throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public String getInfo() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public void setInfo(String info) throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public Boolean getStatus() throws NotImplementedException {
        throw new NotImplementedException("");
    }

    public void setStatus(Boolean status) throws NotImplementedException {
        throw new NotImplementedException("");
    }
}
