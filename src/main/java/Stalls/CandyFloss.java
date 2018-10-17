package Stalls;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class CandyFloss extends Stall implements ITicketed, IReviewed {
    public CandyFloss(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.20;
    }

    @Override
    public double visitorPrice(Visitor visitor) {
        return 4.20;
    }
}
