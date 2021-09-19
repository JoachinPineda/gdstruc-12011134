package com.Quiz2.Module2;

public class PlayerLinkedList {

    private PlayerNode head;
    private PlayerNode tail;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList(){

        PlayerNode current = head;
        System.out.print("Head -> ");
        while (current != null){
            System.out.print(current.getPlayer().getName() + ", Level: " + current.getPlayer().getLevel() + ", ID: " + current.getPlayer().getId());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void deleteFromStart() {

            if(head != tail) {
                head = head.getNextPlayer();
            }
            else {
                head = tail = null;
            }
    }

    public int getCount()
    {
        PlayerNode temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.getNextPlayer();
        }
        return count;
    }

    public int indexOf(Player player) {
            int index = 0;
            PlayerNode temp = head;

            while (temp != null) {
                if (temp.equals(player)) {
                    return index;
                }
                index++;
                temp = temp.getNextPlayer();
            }

            return index;
    }

    public boolean contains(Player player){
        boolean isTrue;
        if(!(this.indexOf(player) == -1)){
            isTrue = true;
        }
        else{
            isTrue = false;
        }
        return isTrue;

    }
}
