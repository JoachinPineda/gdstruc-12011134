package com.Quiz2.Module2;

public class Main {

    public static void main(String[] args) {
	Player arby = new Player(1, "Arby", 100);
    Player binko = new Player(2, "Binko", 205);
    Player dialgio = new Player(3, "Dialgio", 34);

    PlayerLinkedList playerLinkedList = new PlayerLinkedList();

    playerLinkedList.addToFront(dialgio);
    playerLinkedList.addToFront(arby);
    playerLinkedList.addToFront(binko);

    playerLinkedList.printList();
    System.out.println("Node count: " + playerLinkedList.getCount());

    playerLinkedList.deleteFromStart();

    playerLinkedList.printList();

    System.out.println("Node count: " + playerLinkedList.getCount());

    System.out.println("Within the list: " + playerLinkedList.contains(arby));


    }
}
