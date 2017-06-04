package java3.myInteface;

/**
 * Created by Violetta on 05-06-2017.
 */
public class Michael_Jackson implements Singer { // класс Michael_Jackson реализует интерфейс singable
    private int numberOfSongs=79;
    private String realName;
    public Michael_Jackson(String realName, int numberOfSongs) {
        this.realName=realName;
        this.numberOfSongs=numberOfSongs;
    }
    public Michael_Jackson() {
        numberOfSongs=100;
    }
    @Override
    public void sing() {
        System.out.println("We are the world!");
    }
    @Override
    public void printData() {
        System.out.println("Michael Jackson real name is "+realName+" and he has "+numberOfSongs+" songs.");
    }
}