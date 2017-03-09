package OnlineRadioDatabase;

public class Song {
    private String artistName;
    private String songName;
    private int length;

    public Song(String artistName, String songName, String[] timeTokens) {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setTime(timeTokens[0], timeTokens[1]);
    }

    public int getLength() {
        return this.length;
    }

    private void setTime(String minutes, String seconds) {
        if (minutes == null || seconds == null) {
            throw new InvalidSongLengthException(InvalidSongLengthException.INVALID_SONG_LENGTH);
        }
        int minutesInt = 0;
        int secondsInt = 0;

        try {
            minutesInt = Integer.parseInt(minutes);
            secondsInt = Integer.parseInt(seconds);
        } catch (IllegalArgumentException iae) {
            throw new InvalidSongLengthException(InvalidSongLengthException.INVALID_SONG_LENGTH);
        }

        if (minutesInt < 0 || minutesInt > 14) {
            throw new InvalidSongLengthException(InvalidSongLengthException.INVALID_SONG_MINUTES);
        }

        if (secondsInt < 0 || secondsInt >= 60) {
            throw new InvalidSongLengthException(InvalidSongLengthException.INVALID_SONG_SECONDS);
        }
        this.length = (minutesInt * 60) + secondsInt;
    }


    private void setArtistName(String artistName) {
        if (artistName == null) {
            throw new InvalidSongException(InvalidSongException.INVALID_SONG);
        }

        if (artistName.length() <= 3 || artistName.length() >= 20) {
            throw new InvalidSongException(InvalidSongException.INVALID_ARTIST_NAME);
        }
        this.artistName = artistName;
    }

    public void setSongName(String songName) {
        if (songName == null) {
            throw new InvalidSongException(InvalidSongException.INVALID_SONG);
        }

        if (songName.length() <= 3 || songName.length() >= 30) {
            throw new InvalidSongException(InvalidSongException.INVALID_SONG_NAME);
        }
        this.songName = songName;
    }
}
