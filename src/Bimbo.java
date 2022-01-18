import java.util.Objects;

public class Bimbo extends Human implements Ibark{
    private Locations location;

    Bimbo(String name, double HP, Locations location) {
        super(name, HP);
        this.location = location;
    }

    public boolean position(Locations where) {
        if (where.equals(Locations.HALLWAY)) {
            System.out.println(this.getName() + " " + "was in the" + " " + where );
            return true;
        } else {
            System.out.println(this.getName() + " is not in the" + where);
            return false;
        }
    }


    public void instanceb(){
        System.out.println("because" + " " + getName() + " will bark so loudly that he will wake up the whole house, and they will run away.");
    }
}
