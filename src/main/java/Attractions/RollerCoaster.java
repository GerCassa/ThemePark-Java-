package Attractions;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowed(Visitor visitor) {
        if(visitor.getAge() > 12 && visitor.getHeight() > 1.45) return true;
        return false;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double visitorPrice(Visitor visitor) {
        if (isAllowed(visitor) == true){
            if(visitor.getHeight() >= 2.00) return defaultPrice() * 2;
            return defaultPrice();
        }
        return 00.00;
    }
}
