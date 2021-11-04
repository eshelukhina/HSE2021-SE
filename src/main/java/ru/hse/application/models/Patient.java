package ru.hse.application.models;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import ru.hse.application.models.Person;

import java.sql.Timestamp;
import java.util.List;

public class Patient extends Person {
    private Integer hospitalId;
    private Integer medicalInsuranse;
    private Integer passport;

    public Patient(String name, String surname, Timestamp birthday,
                   Integer hospitalId, String medicalInsuranse, List<Integer> passport) {
        super(name, surname, birthday);
    }

    public Integer getHospitalId() throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }

    public void setHospitalId(Integer hospitalId) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }

    public String getMedicalInsuranse() throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }

    public void setMedicalInsuranse(Integer medicalInsuranse) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }

    public List<Integer> getPassport() throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }

    public void setPassport(Integer passport) throws NotImplementedException {
        throw new NotImplementedException("Not implemented yet");
    }
}
