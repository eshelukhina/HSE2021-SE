package ru.hse.application.models;

import java.util.List;

public class Hospital {
    private Integer id;
    private String name;
    private String address;
    private List<Integer> doctorIds;

    public Hospital(String name, String address, List<Integer> doctorIds) {
        this.name = name;
        this.address = address;
        this.doctorIds = doctorIds;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Integer> getDoctorIds() {
        return doctorIds;
    }
}
