package Interfaces;

import Visitors.Visitor;

public interface ITicketed {
    double defaultPrice();

    double visitorPrice(Visitor visitor);
}
