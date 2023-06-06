
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }

        if (!(compare instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compare;

        if (this.name.equals(comparedSong.name)
                && this.artist.equals(comparedSong.artist) && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
