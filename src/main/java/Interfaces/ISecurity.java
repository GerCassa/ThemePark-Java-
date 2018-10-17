package Interfaces;

import Visitors.Visitor;

public interface ISecurity {
    boolean isAllowed(Visitor visitor);
}
