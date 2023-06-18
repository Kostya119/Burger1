public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayo;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
    }
    @Override
    public String toString() {
        return "" +
                " " + bun +
                ", " + meat +
                ", " + cheese +
                ", " + greens +
                ", " + mayo;
    }
}