public class Airport {
    private String location;
    private String name;

    public Airport(String location,String name) {
        this.location = location;
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
