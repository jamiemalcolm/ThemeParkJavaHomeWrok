import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private String name;
    private ArrayList<IReviewed> stallsAndAttractions;


    public ThemePark(String name){
        this.name = name;
        this.stallsAndAttractions = new ArrayList<IReviewed>();
    }

    public void addAttractionOrStall(IReviewed item){
        this.stallsAndAttractions.add(item);
    }

    public String getName() {
        return name;
    }

    public int getNumAttrAndStalls(){
        return this.stallsAndAttractions.size();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.stallsAndAttractions;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.visited(attraction);
        attraction.addToVisitCount();
    }
}
