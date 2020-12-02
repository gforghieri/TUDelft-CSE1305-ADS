package week2.tutorials;

public class PlayList {
    private String[] songs;
    // private Song nowPlaying;
    // private Song nextSong;
    // private Song previousSong;
    private LibraryQueue libraryQueue;
    private LibraryStack libraryStack;

    /**
     * Constructor of the playlist, creates a playlist with the given songs.
     * @param songs - the songs that will be part of this playlist
     */
    public PlayList(String[] songs) {
        this.songs = songs;
        // nowPlaying = null;
        // nextSong = null;
        // previousSong = null;
        libraryQueue = new LibraryQueue();
        for (String s: this.songs) libraryQueue.enqueueBack(s);
        System.out.println(libraryQueue.items.size());
        libraryStack = new LibraryStack();
    }

    /**
     * Starts playing the first song in the playlist, if no songs was playing yet.
     * @return the first song that will be played if no song was playing, otherwise null
     */
    public String playSong() {
        if (libraryQueue.isEmpty()) return null;
        libraryStack.push(libraryQueue.dequeue());
        return libraryStack.top();

    }

    /**
     * Switches to the next song in the playlist.
     * @return the next song in the playlist
     */
    public String nextSong() {
        libraryStack.push(libraryQueue.dequeue());
        return libraryStack.top();
    }

    /**
     * Switches back to the previous song in the playlist.
     * @return the previous song in the playlist
     */
    public String previousSong() {
        libraryQueue.enqueueFront(libraryStack.pop());
        return libraryStack.top();
    }
}


