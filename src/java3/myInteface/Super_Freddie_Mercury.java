package java3.myInteface;

/**
 * Created by Violetta on 05-06-2017.
 */
public class Super_Freddie_Mercury extends Freddie_Mercury {
    int numberOfCats; // количество котов у Фредди Меркьюри
    public Super_Freddie_Mercury() {
        super();
        numberOfCats=0;
    }
    public Super_Freddie_Mercury(String rn, int ns, int cats) {
        super(rn,ns);
        numberOfCats=cats;
    }
    public String cuss_out() {
        return "F*ck you!";
    }
    public int numOfCats() {
        return numberOfCats;
    }
}