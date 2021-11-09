package ru.hse.application.models;

import java.util.Set;

public class Hospital {
    private Integer id;
    private final String name;
    private final String address;
    private Set<Integer> doctorIds;

    public Hospital(String name, String address, Set<Integer> doctorIds) {
        this.name = name;
        this.address = address;
        this.doctorIds = doctorIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Set<Integer> getDoctorIds() {
        return doctorIds;
    }

    @Override
    public String toString() {
        return  "hospital_id: " + id + '\n' +
                "name: " + name + '\n' +
                "address: " + address + '\n' +
                "doctors_ids: " + doctorIds + '\n';
    }
}
