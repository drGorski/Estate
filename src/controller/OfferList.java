package controller;
import model.Estate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class OfferList {
    private ArrayList<Estate> offers;
    public OfferList(){
        offers = new ArrayList<>();
    }
    public void addOffer(Estate offer) {
        offers.add(offer);
    }
    public List<Estate> filterOffers(Predicate<Estate> predicate) {
        List<Estate> result = new ArrayList<>();
        for (Estate offer : offers) {
            if (predicate.test(offer)) {
                result.add(offer);
            }
        }
        return result;
    }
}
