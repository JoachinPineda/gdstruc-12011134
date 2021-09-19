package com.Quiz2.Module1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Player> playerList = new ArrayList<>();

    playerList.add(new Player(1, "Arby", 100));
    playerList.add(new Player(2, "Bink", 203));
    playerList.add(new Player(1, "Dialgio", 35));


    playerList.add(2, new Player( 553, "Steve", 55));

    playerList.remove(2);

    System.out.println(playerList.indexOf(new Player(2, "Bink", 203)));

    for (Player p : playerList)
    {
        System.out.println(p);
    }

    }
}
