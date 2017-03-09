package OnlineRadioDatabase;

public class InvalidSongException extends IllegalArgumentException {
    public static final String INVALID_SONG = "Invalid song.";
    public static final String INVALID_ARTIST_NAME = "Artist name should be between 3 and 20 symbols.";
    public static final String INVALID_SONG_NAME = "Song name should be between 3 and 30 symbols.";

    public InvalidSongException(String message) {
        super(message);
    }
}
