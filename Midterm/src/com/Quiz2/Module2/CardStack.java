package com.Quiz2.Module2;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {

    private LinkedList<Card> stack;

    public CardStack()
    {
        stack = new LinkedList<Card>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Printing Cards: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int countStack()
    {
        return stack.size();
    }

}
