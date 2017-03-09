package OnlineRadioDatabase;

import java.util.ArrayList;
import java.util.List;

public class RadioDatabase {
    private List<Song> playlist;
    private int totalTime;

    public RadioDatabase() {
        this.playlist = new ArrayList<>();
    }

    public void addSong(Song song) throws NoSuchFieldException, IllegalAccessException {
        this.playlist.add(song);
        totalTime += song.getLength();
        System.out.println("Song added.");
    }

    private List<Song> getPlaylist() {
        return this.playlist;
    }

    private int getTotalTime() {
        return totalTime;
    }

    @Override
    public String toString() {
        return String.format("Songs added: %s%nPlaylist length: %sh %sm %ss",
                this.getPlaylist().size(),
                this.getTotalTime() / 3600,
                this.getTotalTime() % 3600 / 60,
                this.getTotalTime() % 60);
    }
}


