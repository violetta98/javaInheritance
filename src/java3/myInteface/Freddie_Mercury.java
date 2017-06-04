package java3.myInteface;

/**
 * Created by Violetta on 05-06-2017.
 */
public class Freddie_Mercury implements Singer { // класс Freddie_Mercury реализует интерфейс singable
    private int numberOfSongs=123;
    private String realName="Farrukh Bulsara";
    public Freddie_Mercury() {
        realName="Farrukh Bulsara";
        numberOfSongs=125;
    }
    public Freddie_Mercury(String rn, int ns) {
        numberOfSongs=ns;
        realName=rn;
    }
    @Override
    public void sing() {
        System.out.println("Show must go on!");
    }
    @Override
    public void printData() {
        System.out.println("Freddie Mercury real name is "+realName+" and he has "+numberOfSongs+" songs.");
    }
}
