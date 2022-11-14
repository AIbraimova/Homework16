public class Animal {
    private String breed;

    public Animal(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return breed;
    }

    public void setName(String name) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                '}';
    }
}




