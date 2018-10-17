package Stalls;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class IceCream extends Stall implements ITicketed, IReviewed {
    public IceCream(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public double defaultPrice() {
        return 2.8;
    }

    @Override
    public double visitorPrice(Visitor visitor) {
        return 2.8;
    }
}
