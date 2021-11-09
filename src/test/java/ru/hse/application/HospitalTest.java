package ru.hse.application;

import org.junit.jupiter.api.Test;
import ru.hse.application.data.HospitalDatabase;
import ru.hse.application.models.Hospital;
import ru.hse.application.services.HospitalService;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class HospitalTest {
    public void clear() {
        HospitalDatabase.clear();
    }

    @Test
    public void testBasicAddHospital() {
        clear();
        Integer id = HospitalService.addHospital(new Hospital("name", "address", Set.of()));
        var hospital = HospitalService.getHospitalById(id);
        assert(hospital.isPresent());
    }

    @Test
    public void testAddHospital() {
        clear();
        Integer id = HospitalService.addHospital(new Hospital("name", "address", Set.of()));
        var hospital = HospitalService.getHospitalById(id);
        assert (hospital.isPresent());
        assertEquals("name", hospital.get().getName());
        assertEquals("address", hospital.get().getAddress());
    }

    @Test
    public void testAddHospitalFail() {
        clear();
        assertThrows(IllegalArgumentException.class,
                () -> HospitalService.addHospital(new Hospital("name_!", "address", Set.of())));
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
