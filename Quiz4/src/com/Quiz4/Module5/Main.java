package com.Quiz4.Module5;

public class Main {

    public static void main(String[] args) {

	    Player ploo = new Player(135, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 630);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 684);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashTable hashtable = new SimpleHashTable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);


        hashtable.printHashtable();
        hashtable.remove("Plooful");
        hashtable.printHashtable();
    }
}
