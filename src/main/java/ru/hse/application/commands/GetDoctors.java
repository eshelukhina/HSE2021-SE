package ru.hse.application.commands;

import ru.hse.application.models.Doctor;
import ru.hse.application.models.Hospital;
import ru.hse.application.services.DoctorService;

import java.util.Scanner;

public class GetDoctors extends Command{
    @Override
    public void execute(Scanner terminal) {
        System.out.println("Введите имя доктора");
        String name = terminal.nextLine();
        System.out.println("Введите фамилию доктора");
        String surname = terminal.nextLine();
        var doctors = DoctorService.getDoctors(name, surname);
        if (doctors.isEmpty()){
            System.out.println("Не удалось найти доктора с заданным именем и фамилией");
            return;
        }
        System.out.println("------------------------");
        for (Doctor doctor : doctors.get()) {
            System.out.println(doctor);
            System.out.println("------------------------");
        }
    }
}
