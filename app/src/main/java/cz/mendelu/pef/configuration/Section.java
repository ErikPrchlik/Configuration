package cz.mendelu.pef.configuration;

public class Section {
    private long id;
    private String name;
    private String type;

    public Section(String name, String type){
        this.name=name;
        this.type=type;
    }

    public Section(){}

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Section{" + "name='" + name + '\'' + ", type='" + type + '\'' + '}';
    }
}
