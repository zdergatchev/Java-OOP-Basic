package OnlineRadioDatabase;

public class InvalidSongLengthException extends InvalidSongException{
    public static final String INVALID_SONG_LENGTH = "Invalid song length.";
    public static final String INVALID_SONG_MINUTES = "Song minutes should be between 0 and 14.";
    public static final String INVALID_SONG_SECONDS = "Song seconds should be between 0 and 59.";

    public InvalidSongLengthException (String message) {
        super(message);
    }
}
