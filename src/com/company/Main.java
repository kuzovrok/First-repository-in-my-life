package com.company;

import java.util.Scanner;

public class Main {

    void userCar(Car car) {
        System.out.println("Марка " + car.getNameCar());
        System.out.println("Мест " + car.getNumOfSeats());
        System.out.println("Макс.скорость " + car.getMaxSpeed());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1;
        System.out.print("Введите ваше имя -> ");
        s1 = scanner.nextLine();

        Human human1 = new Human();
        human1.setName(s1);
        System.out.print("Водитель ");
        human1.print();

        Main main = new Main();
        Car car = new Toyota();
        main.userCar(car);

    }

}
