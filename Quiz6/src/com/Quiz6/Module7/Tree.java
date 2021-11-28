package com.Quiz6.Module7;

public class Tree {

    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseDescending()
    {if (root != null)
    {
        root.traverseDescending();
    }

    }

    public void minValue()
    {
        if (root != null)
        {
            System.out.println(root.minValue(root));
        }
    }

    public void maxValue()
    {
        if (root != null)
        {
            System.out.println(root.maxValue(root));
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }
}
