package ru.hse.application;

import ru.hse.application.commands.*;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Госуслуги. Медицина!");
        System.out.println("Список доступных комманд:");
        System.out.println("* add doctor - добавить доктора в систему");
        System.out.println("* add hospital - добавить больницу в систему");
        System.out.println("* add doctor to hospital - поиск среди докторов по имени и фамилии");
        System.out.println();
        System.out.println("* get doctors - поиск среди докторов по имени и фамилии");
        System.out.println("* get hospitals - поиск больницы по названию");
        System.out.println();
        System.out.println("* exit - закрыть программу");
        System.out.println();
        System.out.println("Введите команду...");
        while (in.hasNext()){
            Optional<Command> command = Optional.empty();
            switch (in.nextLine()){
                case ("add doctor"):
                    command =  Optional.of(new AddDoctor());
                    break;
                case ("add hospital"):
                    command = Optional.of(new AddHospital());
                    break;
                case ("add doctor to hospital"):
                    command = Optional.of(new AddDoctorToHospital());
                    break;
                case ("get doctors"):
                    command = Optional.of(new GetDoctors());
                    break;
                case ("get hospitals"):
                    command = Optional.of(new GetHospitals());
                    break;
                case ("exit"):
                    System.out.println("Выключаемся. До скорой встречи!");
                    return;
            }
            if (command.isEmpty()) {
                System.out.println("Неизвестная команда, попробуйте снова");
                continue;
            }
            command.get().execute(in);
            System.out.println("Введите следующую команду...");
        }
    }
}
