package CH5Adapter;

public class AcreageDeterminator {
    Lot lot;

    public double determineAcreage(Lot tLot) {
        lot = tLot;
        return lot.length * lot.width;
    }
}
