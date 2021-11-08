package ru.hse.application;

import org.junit.jupiter.api.Test;
import ru.hse.application.data.HospitalDatabase;
import ru.hse.application.models.Hospital;
import ru.hse.application.services.HospitalService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HospitalTest {
    public void clear() {
        HospitalDatabase.clear();
    }

    @Test
    public void testBasicAddHospital() {
        clear();
        Integer id = HospitalService.addHospital(new Hospital("name", "address", List.of()));
        Hospital hospital = HospitalService.getHospitalById(id);
        assertNotNull(hospital);
    }

    @Test
    public void testAddHospital() {
        clear();
        Integer id = HospitalService.addHospital(new Hospital("name", "address", List.of()));
        Hospital hospital = HospitalService.getHospitalById(id);
        assertNotNull(hospital);
        assertEquals("name", hospital.getName());
        assertEquals("address", hospital.getAddress());
    }

    @Test
    public void testAddHospitalFail() {
        clear();
        assertThrows(IllegalArgumentException.class,
                () -> HospitalService.addHospital(new Hospital("name_!", "address", List.of())));
    }

    @Test
    public void testBasicCheckHospitalName() {
        clear();
        String name = "name";
        assertTrue(HospitalService.checkHospitalName(name));
    }

    @Test
    public void testCheckHospitalNameFail() {
        clear();
        String name = "name1_";
        assertFalse(HospitalService.checkHospitalName(name));
    }

    @Test
    public void testCheckHospitalName() {
        clear();
        String name = "Hospital 123";
        assertTrue(HospitalService.checkHospitalName(name));
    }
}
