package ru.hse.application.commands;

import ru.hse.application.models.Hospital;
import ru.hse.application.services.DoctorService;
import ru.hse.application.services.HospitalService;

import java.util.Scanner;

public class GetHospitals extends Command{
    @Override
    public void execute(Scanner terminal) {
        System.out.println("Введите название больницы");
        String hospitalName = terminal.nextLine();
        var hospitals = HospitalService.getHospitals(hospitalName);
        if (hospitals.isEmpty()){
            System.out.println("Больниц с данным названием не существует");
            return;
        }
        System.out.println("------------------------");
        for (Hospital hospital : hospitals.get()) {
            System.out.println(hospital);
            System.out.println("------------------------");
        }
    }
}
