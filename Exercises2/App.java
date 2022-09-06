import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // 1. Create your own music playlist by creating a LinkedList object
        LinkedList<String> playList = new LinkedList<>();

        // 2. Add 5 new songs to your Playlist using the add() method
        playList.add("Mahika");
        playList.add("Pangako");
        playList.add("Neversaynever");
        playList.add("Tunay");
        playList.add("Dancewithyou");

        // 3. Add a new song at the front of the Playlist using the addFirst() method
        playList.addFirst("Withyou");

        // 4. Add a new song at the end of the Playlist using the addLast() method
        playList.addLast("Newflame");

        // 5. Display the song at the front of the Playlist using the combination of
        // get() method and the println() method
        String band = playList.get(0);
        System.out.println("FRONT SONG " + band);

        // 6. Replace the last song using the set() method
        playList.set(6, "Intention");

        // 7. Remove the first song using the remove() method
        String dot = playList.remove(0);
        System.out.println("REMOVE " + dot);

        // 8. Display all songs in your Playlist using the println method
        System.out.println("ALL SONGS IN THE PLAYLIST " + playList);
    }
}
