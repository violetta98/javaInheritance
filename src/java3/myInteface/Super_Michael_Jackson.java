package java3.myInteface;

/**
 * Created by Violetta on 05-06-2017.
 */
public class Super_Michael_Jackson extends Michael_Jackson {
    public Super_Michael_Jackson() {super();}
    public Super_Michael_Jackson(String realName, int numberOfSongs) {
        super(realName, numberOfSongs);
    }
    public void dance() {
        System.out.println("Michael Jackson is dancing! :)");
    }
}