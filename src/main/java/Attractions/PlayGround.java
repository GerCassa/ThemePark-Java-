package Attractions;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Visitors.Visitor;

public class PlayGround extends Attraction implements ISecurity, IReviewed {
    public PlayGround(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if(visitor.getAge() < 15) return true;
        return false;
    }
}
