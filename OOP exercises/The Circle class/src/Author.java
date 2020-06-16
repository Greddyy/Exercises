public class Author {
    private String name;
    private String emai;
    private char gender;

    public Author(String name, String emai, char gender) {
        this.name = name;
        this.emai = emai;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", emai='" + emai + '\'' +
                ", gender=" + gender +
                '}';
    }
}
