package ru.hse.application.commands;

import ru.hse.application.services.DoctorService;
import ru.hse.application.services.HospitalService;

import java.util.Scanner;

public class AddDoctorToHospital extends Command {
    @Override
    public void execute(Scanner terminal) {
        System.out.println("Введите id доктора");
        var doctor_id = Integer.parseInt(terminal.nextLine());
        while (DoctorService.getDoctorById(doctor_id).isEmpty()){
            System.out.println("Доктора с указаным id не существует. Попробуйте снова");
            doctor_id = Integer.parseInt(terminal.nextLine());
        }
        System.out.println("Введите id больницы");
        var hospital_id = Integer.parseInt(terminal.nextLine());
        while (HospitalService.getHospitalById(hospital_id).isEmpty()){
            System.out.println("Больница с указаным id не существует. Попробуйте снова");
            hospital_id = Integer.parseInt(terminal.nextLine());
        }
        HospitalService.addDoctor(doctor_id, hospital_id);
    }
}
