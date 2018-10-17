package Attractions;

import Interfaces.IReviewed;

public class Park extends Attraction implements IReviewed {
    public Park(String name, int rating) {
        super(name, rating);
    }
}
