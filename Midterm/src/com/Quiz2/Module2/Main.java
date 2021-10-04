package com.Quiz2.Module2;

import java.util.Scanner;
import java.util.Random;
import java.util.*;


public class Main {

    public static void main(String[] args)
    {
        CardStack stack = new CardStack();
        stack.push(new Card("Play Card 1"));
        stack.push(new Card("Play Card 2"));
        stack.push(new Card("Play Card 3"));
        stack.push(new Card("Play Card 4"));
        stack.push(new Card("Play Card 5"));

        CardStack playerDeck = new CardStack();
        playerDeck.push(new Card("Queen of Diamonds"));
        playerDeck.push(new Card("Club of Diamonds"));
        playerDeck.push(new Card("King of Diamonds"));
        playerDeck.push(new Card("Ace of Diamonds"));
        playerDeck.push(new Card("4 of Diamonds"));
        playerDeck.push(new Card("5 of Diamonds"));

        playerDeck.push(new Card("Queen of Hearts"));
        playerDeck.push(new Card("Club of Hearts"));
        playerDeck.push(new Card("King of Hearts"));
        playerDeck.push(new Card("Ace of Hearts"));
        playerDeck.push(new Card("4 of Hearts"));
        playerDeck.push(new Card("5 of Hearts"));

        playerDeck.push(new Card("Queen of Spades"));
        playerDeck.push(new Card("Club of Spaces"));
        playerDeck.push(new Card("Kind of Spades"));
        playerDeck.push(new Card("Ace of Spades"));
        playerDeck.push(new Card("4 of Spades"));
        playerDeck.push(new Card("5 of Spades"));

        playerDeck.push(new Card("Queen of Clubs"));
        playerDeck.push(new Card("Club of Clubs"));
        playerDeck.push(new Card("Kind of Clubs"));
        playerDeck.push(new Card("Ace of Clubs"));
        playerDeck.push(new Card("4 of Clubs"));
        playerDeck.push(new Card("5 of Clubs"));

        playerDeck.push(new Card("Joker"));

        playerDeck.push(new Card("Red Reverse Uno"));
        playerDeck.push(new Card("Blue Reverse Uno"));
        playerDeck.push(new Card("Green Reverse Uno"));
        playerDeck.push(new Card("Yellow Reverse Uno"));
        playerDeck.push(new Card("+4 Uno"));




        CardStack discardDeck = new CardStack();


        while (true)
        {
            stack.printStack();
            System.out.println("Player Deck: " + playerDeck.countStack());
            System.out.println("Discarded Pile: " + discardDeck.countStack());

            if (stack.isEmpty() == false)
            {
                System.out.println("Input number of cards: ");
                Scanner scanner = new Scanner(System.in);

                int input = scanner.nextInt();

                Random rng = new Random();
                int number = 1+rng.nextInt(3);

                if (number == 1 && playerDeck.isEmpty() == false) // Draw x cards (x can be a random value from 1 to 5)
                {

                    System.out.println("Draw x cards (x can be a random value from 1 to 5");
                    if (input > playerDeck.countStack())
                    {
                        for (int i = 1; i <= playerDeck.countStack(); i++)
                        {
                            stack.push(playerDeck.pop());
                        }
                    }
                    else
                    {
                        for (int i = 1; i <= input; i++)
                        {
                            stack.push(playerDeck.pop());
                        }
                    }
                }
                else if (number == 2 && discardDeck.isEmpty() == false) //Get x cards from the discarded pile
                {
                    System.out.println("Get x cards from the discarded pile");
                    if (input > discardDeck.countStack())
                    {
                        for (int i = 1; i <= discardDeck.countStack(); i++)
                        {
                            stack.push(discardDeck.pop());
                        }
                    }
                    else
                    {
                        for (int i = 1; i <= input; i++)
                        {
                            stack.push(discardDeck.pop());
                        }

                    }
                }
                else // Discard x cards
                {
                    if (input > stack.countStack())
                    {
                        for (int i = 1; i <= stack.countStack(); i++) {
                            discardDeck.push(stack.pop());
                        }
                    }
                    else {
                        for (int i = 1; i <= input; i++) {
                            discardDeck.push(stack.pop());
                        }
                    }
                }

            }
            else
            {
                break;
            }
        }
        System.out.println("You finally ran out of cards. You win!");


    }

}

