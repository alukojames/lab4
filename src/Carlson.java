import java.util.Objects;

public class Carlson extends Human implements Ibuild, IstretchClothesline{
    private Locations location;

    Carlson(String name, double HP, Locations location) {
        super(name,HP);
        this.location = location;
    }

    //Carlson(String name, double HP, Locations l) {
      //  super(name, HP);
        //this.location = l;
    //}

    public boolean position(Locations where) {

        try {
            String name = this.getName();
            if (where.equals(Locations.HALLWAY)) {
                System.out.println(name + " was in the " + where);
            } else {
                throw new HallwayException(name + " is not in the Hallway");
            }
            return true;
        } catch (HallwayException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean build(Action what){
        if (what.equals(Action.Build)){
        System.out.println(this.getName() + " began to build a very cunning " + Items.TRAP + " for thieves.");
        return true;}
        //return this.getName() + " began to build a very cunning" + what + " for thieves."
        else {
            System.out.println(this.getName() + " wasnt building anything   ");
            return false;
        }
    }

    public boolean stretchCLothesLine(Action what){
        if (what.equals(Action.Stretch_clothesline)){
            System.out.println(this.getName() + " stretched the" + what + " several times between the chairs at a low height.");
            return true;}
        //return this.getName() + " began to build a very cunning" + what + " for thieves."
        else {
            System.out.println(this.getName() + " wasnt streteching anything   ");
            return false;
        }
    }
    public boolean worriedForNothing(Action what) {
        if (what.equals(Action.Not_worried)) {
            System.out.println("But " + this.getName() + " " + Action.Not_worried + ".");
            return true;
        } else {
            System.out.println(this.getName() + " was worried");
            return false;
        }
    }
    public void instance(){
        System.out.println("Now if any thief enters the door in the dark, he will surely fall");
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getName(),this.getHP());
    }


    @Override
    public boolean Stretch_clothesline(Action how) {
        return false;
    }

    public boolean carlsonWithChairs(Items what){
        if (what.equals(Items.Chairs)) {
            System.out.println(Items.Chairs + "and now");
            return true;
        }
        else {
            System.out.println(this.getName() + " there were no even chairs there.   ");
            return false;
        }
    }
    public void instanceb(){
        System.out.println("Carlson said will bark so loudly that he will wake up the whole house, and they will run away.");
    }
    public void instancec(){
        System.out.println( this.getName() + " " + "said sternly. - It turns out that I made a trap for thieves in vain! No, that's not how I play. The dog must be removed immediately.");
    }

}
