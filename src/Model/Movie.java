package Model;

/**
 * Created by Administrator on 2017/5/1.
 */
public class Movie {
    private String ID;
    private String name;
    private int length;
    private String poster;//图片地址

    public Movie(String ID, String name, int length, String poster){
        this.ID = ID;
        this.name = name;
        this.length = length;
        this.poster = poster;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getPoster() {
        return poster;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}
