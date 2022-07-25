import java.util.List;

public class Band {
    private List<Artist> members;
    private int numberofmembers;

    public Band(List<Artist> members, int numberofmembers) {
        this.members = members;
        this.numberofmembers = numberofmembers;
    }

    public List<Artist> getMembers() {
        return members;
    }

    public void setMembers(List<Artist> members) {
        this.members = members;
    }

    public int getNumberofmembers() {
        return numberofmembers;
    }

    public void setNumberofmembers(int numberofmembers) {
        this.numberofmembers = numberofmembers;
    }
}

