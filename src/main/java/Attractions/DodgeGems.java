package Attractions;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class DodgeGems extends Attraction implements ITicketed, IReviewed {
    public DodgeGems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.5;
    }

    @Override
    public double visitorPrice(Visitor visitor) {
        if (visitor.getAge() <= 12) return defaultPrice() / 2;
        return defaultPrice();
    }
}
