import java.util.ArrayList;
import java.util.List;

public class Decades {
    private List<Album> sixties = new ArrayList<>();
    private List<Album> seventies = new ArrayList<>();
    private List<Album> eightties = new ArrayList<>();
    private List<Album> ninties = new ArrayList<>();
    private List<Album> thousands = new ArrayList<>();
    private List<Album> thousandandten = new ArrayList<>();

    public Decades(List<Album> sixties, List<Album> seventies, List<Album> eightties, List<Album> ninties, List<Album> thousands, List<Album> thousandandten) {
        this.sixties = sixties;
        this.seventies = seventies;
        this.eightties = eightties;
        this.ninties = ninties;
        this.thousands = thousands;
        this.thousandandten = thousandandten;
    }

    public List<Album> getSixties() {
        return sixties;
    }

    public void setSixties(List<Album> sixties) {
        this.sixties = sixties;
    }

    public List<Album> getSeventies() {
        return seventies;
    }

    public void setSeventies(List<Album> seventies) {
        this.seventies = seventies;
    }

    public List<Album> getEightties() {
        return eightties;
    }

    public void setEightties(List<Album> eightties) {
        this.eightties = eightties;
    }

    public List<Album> getNinties() {
        return ninties;
    }

    public void setNinties(List<Album> ninties) {
        this.ninties = ninties;
    }

    public List<Album> getThousands() {
        return thousands;
    }

    public void setThousands(List<Album> thousands) {
        this.thousands = thousands;
    }

    public List<Album> getThousandandten() {
        return thousandandten;
    }

    public void setThousandandten(List<Album> thousandandten) {
        this.thousandandten = thousandandten;
    }

    public void addtodecades(Album album) {
        if (album.getReleaseyear() <= 1960 && album.getReleaseyear() > 1970) sixties.add(album);
        if (album.getReleaseyear() <= 1970 && album.getReleaseyear() > 1980) seventies.add(album);
        if (album.getReleaseyear() <= 1980 && album.getReleaseyear() > 1990) eightties.add(album);
        if (album.getReleaseyear() <= 1990 && album.getReleaseyear() > 2000) ninties.add(album);
        if (album.getReleaseyear() <= 2000 && album.getReleaseyear() > 2010) thousands.add(album);
        if (album.getReleaseyear() <= 2010 && album.getReleaseyear() > 2020) thousandandten.add(album);
    }

    public List<Album>printlist(String decadeselected){
            if (decadeselected == "60") return sixties;
            if (decadeselected =="70") return seventies;
            if (decadeselected == "80") return eightties;
            if (decadeselected == "90") return ninties;
            if (decadeselected == "00") return thousands;
            if (decadeselected == "10") return thousandandten;
    else return null;
    }
}
