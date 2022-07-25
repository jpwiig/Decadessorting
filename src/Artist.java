import java.util.List;

public class Artist {
    private String name;
    private int age;
    private List<String>instruments;

    public Artist(String name, int age, List<String> instruments) {
        this.name = name;
        this.age = age;
        this.instruments = instruments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<String> instruments) {
        this.instruments = instruments;
    }
}
