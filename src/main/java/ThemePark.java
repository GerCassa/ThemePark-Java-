import Attractions.Attraction;
import Attractions.RollerCoaster;
import Interfaces.IReviewed;
import Stalls.Stall;
import Stalls.Tobacco;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> revieweds;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name) {
        this.name = name;
        this.revieweds = new ArrayList<>();
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countAttractions() {
        return attractions.size();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public int stallsCount() {
        return stalls.size();
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public int countReviewedThings() {
        return revieweds.size();
    }

    public void addReviewedThings() {
        for (Stall stall : stalls) {
            revieweds.add((IReviewed) stall);
        }
        for(Attraction attraction : attractions) {
            revieweds.add((IReviewed) attraction);
        }
    }
}
