import java.util.*;

class Node {
    public List<Integer> children = new ArrayList<>();
    public int lockedBy = -1;
}

class LockingTree {
    private int[] parent;
    private Node[] nodes;

    public LockingTree(int[] parent) {
        this.parent = parent;
        nodes = new Node[parent.length];

       
        for (int i = 0; i < parent.length; ++i)
            nodes[i] = new Node();

        // Parent-child relationship banao
        for (int i = 1; i < parent.length; ++i)
            nodes[parent[i]].children.add(i);
    }

    public boolean lock(int num, int user) {
        if (nodes[num].lockedBy != -1)
            return false; // Already locked
        nodes[num].lockedBy = user;
        return true;
    }

    public boolean unlock(int num, int user) {
        if (nodes[num].lockedBy != user)
            return false; // Kisi aur user ne lock kiya tha
        nodes[num].lockedBy = -1;
        return true;
    }

    public boolean upgrade(int num, int user) {
        if (nodes[num].lockedBy != -1)
            return false; // Node already locked

        if (!anyLockedDescendant(num))
            return false; // Koi bhi descendant locked nahi

        for (int i = num; i != -1; i = parent[i]) {
            if (nodes[i].lockedBy != -1)
                return false; // Koi ancestor locked hai
        }

        // Sab descendants unlock karo
        unlockDescendants(num);
        nodes[num].lockedBy = user;
        return true;
    }

    private boolean anyLockedDescendant(int i) {
        if (nodes[i].lockedBy != -1)
            return true;

        for (int child : nodes[i].children) {
            if (anyLockedDescendant(child))
                return true;
        }

        return false;
    }

    private void unlockDescendants(int i) {
        nodes[i].lockedBy = -1;
        for (int child : nodes[i].children)
            unlockDescendants(child);
    }
}