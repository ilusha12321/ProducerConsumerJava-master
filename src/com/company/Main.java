package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter storage size: ");
        int storageSize = scanner.nextInt();

        System.out.print("Enter number of items: ");
        int itemNumbers = scanner.nextInt();

        Main main = new Main();
        main.starter(storageSize, itemNumbers);
    }

    private void starter(int storageSize, int itemNumbers) {
        Manager manager = new Manager(storageSize);
        new Consumer(itemNumbers, manager);

        new Producer(itemNumbers, manager);
    }
}
