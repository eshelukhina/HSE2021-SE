package ru.hse.application.commands;

import ru.hse.application.models.Hospital;
import ru.hse.application.services.HospitalService;


import java.util.HashSet;
import java.util.Scanner;

public class AddHospital extends Command{
    @Override
    public void execute(Scanner terminal) {
        System.out.println("Введите название больницы");
        String name = terminal.nextLine();
        while (!HospitalService.checkHospitalName(name)){
            System.out.println("Некорретное название. Попробуйте снова");
            name = terminal.nextLine();
        }
        System.out.println("Введите аддрес больницы");
        String address = terminal.nextLine();

        HospitalService.addHospital(new Hospital(name, address, new HashSet<>()));
    }
}
