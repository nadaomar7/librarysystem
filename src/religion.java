import java.util.ArrayList;

public class religion implements library {
    public int c=0;

    public religion (){}

    public religion ( int c){

        this.c=c;
    }
    ArrayList<String> serialno = new ArrayList<>();
    ArrayList <String> authorname = new ArrayList<>();
    ArrayList <String> bookname = new ArrayList<>();
    public int countbooks() {
        return c++;
    }


    public void addbooks() {
        bookname.add("The Quran");
        bookname.add("The Book Of Common Prayer.");
        bookname.add("The Holy Bible");

    }

    @Override
    public void removebook() {

    }


    public void getSerialno() {
        serialno.add("9563854875445");
        serialno.add("9563854665445");
        serialno.add("9563878569455");

    }

    public void addauthors(){
        authorname.add("John Piper ");
        authorname.add("Kay Arthur");
        authorname.add("Jennie Allen");
    }
    public int price(int y) {
        return y + c;
    }
}
