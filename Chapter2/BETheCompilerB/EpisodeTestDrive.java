package BETheCompilerB;

public class EpisodeTestDrive {
  public static void main(String[] args) {
    Episode episode = new Episode();

    episode.seriesNumber = 4;
    episode.episodeNumber = 10;
    episode.play();
    episode.skipIntro();
  }
}
