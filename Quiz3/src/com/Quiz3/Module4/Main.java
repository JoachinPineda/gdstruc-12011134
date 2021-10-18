package com.Quiz3.Module4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayQueue stack = new ArrayQueue(7);

        //Set of Players
        stack.add(new Player(1, "Arby", 100));
        stack.add(new Player(2, "Steve", 101));
        stack.add(new Player(3, "Robert", 102));
        stack.add(new Player(4, "Bob", 103));
        stack.add(new Player(5, "Glob", 104));
        stack.add(new Player(6, "Mob", 105));
        stack.add(new Player(7, "Lob", 106));

        //In queue
        ArrayQueue queue = new ArrayQueue(7);
        queue.add(new Player(1, "Darby", 100));
        queue.add(new Player(2, "Eve", 101));
        queue.add(new Player(3, "Bert", 102));
        queue.add(new Player(4, "Stephen", 104));
        queue.add(new Player(5, "Steven", 104));

        Scanner pauser = new Scanner(System.in);

        int game = 0;


        //Start of the Game
        System.out.println("In Queue: ");
        queue.printQueue();
        for (int i = 0; i < 4; i++) {
            stack.add(queue.remove());
        }
        game++;
        System.out.println("Successful Games Made: " + game);

        while (true) {

            if (game < 10) {

                System.out.println("Press Enter to continue");
                pauser.nextLine();

                Random rng = new Random();
                int number = 1 + rng.nextInt(7);

                //Game queuing

                if (number > stack.size()) {
                    for (int i = 0; i < queue.size(); i++) {
                        queue.add(stack.remove());
                    }
                }
                else
                {
                    for (int i = 0; i < number; i++) {
                        queue.add(stack.remove());
                    }
                }

                    System.out.println("In Queue: ");
                    queue.printQueue();

                    //popping from Queue
                    if (queue.size() >= 5) {
                        System.out.println("5 Players Detected. Popping now");
                        for (int i = 0; i < 5; i++) {
                            stack.add(queue.remove());
                        }
                        game++;
                    }

                    //Game Result
                    System.out.println("Currently In Queue: ");
                    queue.printQueue();
                    System.out.println("Successful Games Made: " + game);
                    pauser.nextLine();
                } else {
                    System.out.println("Successful Games Quota reached");
                    System.out.println("Game Over");
                    break;
                }

            }

        }
    }
