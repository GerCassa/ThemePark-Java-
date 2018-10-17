package Stalls;


import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class Tobacco extends Stall implements ISecurity, ITicketed, IReviewed {
    public Tobacco(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if (visitor.getAge() >= 18) return true;
        return false;
    }

    @Override
    public double defaultPrice() {
        return 6.6;
    }

    @Override
    public double visitorPrice(Visitor visitor) {
        if(isAllowed(visitor) == true) return 6.6;
        return 00.00;
    }
}
