// Surname: Isaacs
// Name: Kaamiel
// Student no: 4129581
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: Playlist.java

public class Playlist {
    private Track root;
    private int size;
    
    // DEFAULT CONSTRUCTORis 
    public Playlist() {
        this.root = null;
        size = 0;
        }

    // ACCESSOR METHODS
    public Track getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    // MUTATOR METHODS
    public void setRoot(Track root) {
        this.root = root;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // METHODS
    public void clear() {
        root = null;
        size = 0;
    }
    // BOOLEAN SEARCH
    public boolean search(String title) {
        if (title == null)
            return false;
        return searchRec(root, title);
    }

    private boolean searchRec(Track node, String title) {
        if (node == null)
            return false;
        int cmp = title.compareToIgnoreCase(node.getTitle());
        if (cmp == 0)
            return true;
        else if (cmp < 0)
            return searchRec(node.getLeft(), title);
        else
            return searchRec(node.getRight(), title);
    }
    
    public void insert(String title, String artist, String album, int minutes, int seconds) {
        if (title == null) {
            return; // do not insert null titles
        } // If title already present, do nothing (assignment typically expects no duplicates)
        if (search(title)) {
            return;
        }

        String id = Integer.toString(size + 1); // simple id generation
        Track newTrack = new Track(id, title, artist, album, minutes, seconds);
        root = insertRec(root, newTrack);
        size++; // increment only when insertion actually happens
    }
    
    private Track insertRec(Track node, Track newTrack) {
        if (node == null) {
            return newTrack;
        }
        int cmp = newTrack.getTitle().compareToIgnoreCase(node.getTitle());
        if (cmp < 0) {
            node.setLeft(insertRec(node.getLeft(), newTrack));
        } else if (cmp > 0) {
            node.setRight(insertRec(node.getRight(), newTrack));
        }
        return node;
    }

    public void delete(String title) {
        if (title == null) {
            return; // do not delete null titles
        }
        if (!search(title)) {
            return; // title not found, nothing to delete
        }
        root = deleteRec(root, title);
        size--; // decrement size only when deletion actually happens
    }

    private Track deleteRec(Track node, String title) {
        if (node == null) {
            return null;
        }

        int cmp = title.compareToIgnoreCase(node.getTitle());
        if (cmp < 0) {
            node.setLeft(deleteRec(node.getLeft(), title));
        } else if (cmp > 0) {
            node.setRight(deleteRec(node.getRight(), title));
        } else {
            // node to delete found
            // Case 1: no child
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            }
            // Case 2: one child
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }
            // Case 3: two children - find inorder successor (smallest in right subtree)
            Track successor = findMin(node.getRight());
            // copy successor's data into current node
            node.setId(successor.getId());
            node.setTitle(successor.getTitle());
            node.setArtist(successor.getArtist());
            node.setAlbum(successor.getAlbum());
            node.setMinutes(successor.getMinutes());
            node.setSeconds(successor.getSeconds());
            // delete successor node from right subtree
            node.setRight(deleteRec(node.getRight(), successor.getTitle()));
        }
        return node;
    }

    private Track findMin(Track node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    public void displayInOrder(Track t) {
        if (t != null) {
            displayInOrder(t.getLeft());
            System.out.println(t.toString());
            displayInOrder(t.getRight());
        }
    }

    public void displayAllInOrder() {
        displayInOrder(root);
    }

    public int height(Track t) {
        if (t == null) {
            return -1;
        } else {
            int leftHeight = height(t.getLeft());
            int rightHeight = height(t.getRight());
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
