package java3;

import java3.myInteface.*;

/**
 * Created by Violetta on 05-06-2017.
 */
public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        m.print(new Michael_Jackson()); // We are the world!
        m.print(new Freddie_Mercury()); // Show must go on!
        m.getData(new Super_Michael_Jackson("lol",6576)); // Michael Jackson real name is lol and he has 6576 songs.
        m.getData(new Freddie_Mercury("ololosh",32)); // Freddie Mercury real name is ololosh and he has 32 songs.
        Super_Michael_Jackson smj=new Super_Michael_Jackson("Michael",5434);
        smj.dance();
        Super_Freddie_Mercury Freddie=new Super_Freddie_Mercury("Farrukh",1234,543);
        System.out.println("Freddie Mercury says: \""+Freddie.cuss_out()+"\"");
        System.out.println("Freddie Mercury has "+Freddie.numOfCats()+" cats (^_^)(^_^)(^_^)");
    }
    public void print(Singer s) {
        s.sing();
    }
    public void getData(Singer s) {
        s.printData();
    }
}
