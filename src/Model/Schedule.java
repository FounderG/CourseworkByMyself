package Model;

/**
 * Created by Administrator on 2017/5/1.
 */
public class Schedule {
    String ID;
    String movieID;
    Screen screen;
    String startTime;
    double originalPrice;

    public Schedule(String ID, String movie, String startTime) {
        this.ID = ID;
        this.movieID = movie;
        this.startTime = startTime;
        this.originalPrice = 16;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setMovie(String movie) {
        this.movieID = movie;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getID() {
        return ID;
    }

    public String getMovieID() {
        return this.movieID;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getStartTime() {
        return startTime;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }
}
