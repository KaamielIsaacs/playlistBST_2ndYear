
public class TestPlaylist {

    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        // --- INSERT TRACKS ---
        myPlaylist.insert("Shape of You", "Ed Sheeran", "Divide", 3, 53);
        myPlaylist.insert("Blinding Lights", "The Weeknd", "After Hours", 3, 20);
        myPlaylist.insert("Bad Guy", "Billie Eilish", "When We All Fall Asleep", 3, 14);
        myPlaylist.insert("Levitating", "Dua Lipa", "Future Nostalgia", 3, 23);

        System.out.println("=== Playlist In-Order ===");
        myPlaylist.displayAllInOrder();
        System.out.println("Size: " + myPlaylist.getSize());
        System.out.println("Height: " + myPlaylist.height(myPlaylist.getRoot()));

        // --- SEARCH TRACK ---
        System.out.println("\nSearching for 'Bad Guy': " + myPlaylist.search("Bad Guy"));
        System.out.println("Searching for 'Hello': " + myPlaylist.search("Hello"));

        // --- DELETE TRACK ---
        System.out.println("\nDeleting 'Blinding Lights'...");
        myPlaylist.delete("Blinding Lights");
        myPlaylist.displayAllInOrder();
        System.out.println("Size after deletion: " + myPlaylist.getSize());

        // --- INSERT AFTER DELETION ---
        System.out.println("\nInserting 'Peaches'...");
        myPlaylist.insert("Peaches", "Justin Bieber", "Justice", 3, 18);
        myPlaylist.displayAllInOrder();
        System.out.println("Size: " + myPlaylist.getSize());

        // --- CLEAR PLAYLIST ---
        System.out.println("\nClearing playlist...");
        myPlaylist.clear();
        System.out.println("Size after clear: " + myPlaylist.getSize());
        System.out.println("Root after clear: " + myPlaylist.getRoot());
    }
}
