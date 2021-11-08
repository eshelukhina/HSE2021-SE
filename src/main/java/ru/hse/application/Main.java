package ru.hse.application;

import ru.hse.application.commands.AddDoctor;
import ru.hse.application.commands.Command;
import ru.hse.application.commands.GetDoctor;

import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Госуслуги. Медицина!");
        System.out.println("Список доступных комманд:");
        System.out.println("* add doctor - добавить доктора в систему");
        System.out.println("* get doctor - найти доктора");
        System.out.println();
        System.out.println("Введите команду...");
        while (in.hasNext()){
            Optional<Command> command = Optional.empty();
            switch (in.nextLine()){
                case ("add doctor"):
                    command =  Optional.of(new AddDoctor());
                    break;
                case ("get doctor"):
                    command = Optional.of(new GetDoctor());
                    break;
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
