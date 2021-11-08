package ru.hse.application.commands;

import ru.hse.application.models.Doctor;
import ru.hse.application.services.DoctorService;

import java.util.Scanner;

public class GetDoctor extends Command{
    @Override
    public void execute(Scanner terminal) {
        System.out.println("Введите имя доктора");
        String name = terminal.nextLine();
        System.out.println("Введите фамилию доктора");
        String surname = terminal.nextLine();
        var doctor = DoctorService.getDoctor(name, surname);
        if (doctor.isEmpty()){
            System.out.println("Не удалось найти доктора с заданным именем и фамилией");
            return;
        }
        System.out.println(doctor.get());
    }
}
