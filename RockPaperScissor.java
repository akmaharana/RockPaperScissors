package com.practices;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] gameRps = {"r", "p", "s"};
        String computerChoice = gameRps[new Random().nextInt(gameRps.length)];
        int chance = 2;
        while (chance != 0) {
            System.out.println("Enter Your Choice from (r,p,s) ");
            String personChoice = sc.next();
            if (personChoice.equalsIgnoreCase("r")
                    || personChoice.equalsIgnoreCase("s")
                    || personChoice.equalsIgnoreCase("p")) {
                if (personChoice.equals(computerChoice)) {
                    System.out.println("Computer Choice is:" + computerChoice);
                    System.out.println("The Game is Tie");
                }
                if (personChoice.equals("r")) {
                    if (computerChoice.equals("p")) {
                        System.out.println("Computer Choice is:" + computerChoice);
                        System.out.println("You Lose!");
                    } else if (computerChoice.equals("s")) {
                        System.out.println("Computer Choice is:" + computerChoice);
                        System.out.println("You Win🎊");
                    }
                }
                if (personChoice.equals("p")) {
                    if (computerChoice.equals("s")) {
                        System.out.println("Computer Choice is:" + computerChoice);
                        System.out.println("You Lose!");
                    } else if (computerChoice.equals("r")) {
                        System.out.println("Computer Choice is:" + computerChoice);
                        System.out.println("You Win🎊");
                    }
                }
                if (personChoice.equals("s")) {
                    if (computerChoice.equals("r")) {
                        System.out.println("Computer Choice is:" + computerChoice);
                        System.out.println("You Lose!");
                    } else if (computerChoice.equals("p")) {
                        System.out.println("Computer Choice is:" + computerChoice);
                        System.out.println("You Win🎊");
                    }
                }
            } else
                System.out.println("Invalid Input❗❗ \nChoose From (r,p,s)");
            System.out.println("Do you want to continue: y/n");
            char ch1 = sc.next().charAt(0);
            if (ch1 == 'n') {
                chance = 0;
                break;
            } else if (ch1 != 'y') {
                chance = chance - 1;
                System.out.println("Wrong Choice Program Break Chacne Left " + chance);
            }
        }
    }
}
