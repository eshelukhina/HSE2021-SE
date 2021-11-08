package ru.hse.application.commands;

import ru.hse.application.models.Doctor;
import ru.hse.application.models.Hospital;
import ru.hse.application.services.DoctorService;
import ru.hse.application.services.HospitalService;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class AddDoctor extends Command {

    @Override
    public void execute(Scanner terminal) {
        System.out.println("Введите имя доктора");
        String name = terminal.nextLine();
        while (!DoctorService.checkDoctorName(name)){
            System.out.println("Некорретное имя. Попробуйте снова");
            name = terminal.nextLine();
        }
        System.out.println("Введите фамилию доктора");
        String surname = terminal.nextLine();

        System.out.println("Введите специализацию доктора");
        String specialization = terminal.nextLine();

        System.out.println("Введите должность доктора");
        String position = terminal.nextLine();

        DoctorService.addDoctor(
                new Doctor(name, surname, Timestamp.valueOf("2001-09-03 00:00:00"),
                        specialization, position, List.of())
        );
    }
}
