package lesson10;

public class Dealer extends Player{
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {return name;}
    @Override
    public boolean needsCard() {
        if(valuesHand()<17){
            return true;
        }else {
            return false;
        }
    }
}
