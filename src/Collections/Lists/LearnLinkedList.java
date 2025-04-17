package Collections.Lists;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        // Adding songs
        playlist.addLast("Song 1");
        playlist.addLast("Song 2");
        playlist.addLast("Song 3");
        System.out.println("Playlist: " + playlist); // [Song 1, Song 2, Song 3]

        // Adding at the beginning
        playlist.addFirst("Song 0");
        System.out.println("After adding Song 0 at the start: " + playlist); // [Song 0, Song 1, Song 2, Song 3]

        // Removing from the end
        String lastSong = playlist.removeLast();
        System.out.println("Removed last song: " + lastSong); // Song 3
        System.out.println("Updated playlist: " + playlist); // [Song 0, Song 1, Song 2]

        // DEQUE implementations
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(10); // Add to tail
        queue.offerFirst(20); // Add to head
        queue.offerLast(30); // Add to tail
        System.out.println(queue); // Output: [20, 10, 30]
    }
}
