public class Album {
    private Artist creator;
    private Band creator2;
    private String Albumname;
    private int releaseyear;

    public Album(Artist creator, Band creator2, String albumname, int releaseyear) {
        this.creator = creator;
        this.creator2 = creator2;
        Albumname = albumname;
        this.releaseyear = releaseyear;
    }

    public Artist getCreator() {
        return creator;
    }

    public void setCreator(Artist creator) {
        this.creator = creator;
    }

    public Band getCreator2() {
        return creator2;
    }

    public void setCreator2(Band creator2) {
        this.creator2 = creator2;
    }

    public String getAlbumname() {
        return Albumname;
    }

    public void setAlbumname(String albumname) {
        Albumname = albumname;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }
}
