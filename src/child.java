import java.util.ArrayList ;
public class child implements library {
    public int c=0;

    public child (){}

    public child ( int c){

        this.c=c;
    }
    ArrayList <String> serialno = new ArrayList<>();
    ArrayList <String> authorname = new ArrayList<>();
    ArrayList <String> bookname = new ArrayList<>();
    public int countbooks() {
        return c++;
    }


    public void addbooks() {
        bookname.add("Fungus the Bogeyman");
        bookname.add("Asterix in Britain");
        bookname.add("Jane eyre");

    }
    public void addauthors(){
        authorname.add("Beverly Cleary");
        authorname.add("Roald Dahl");
        authorname.add("Kate DiCamillos");
    }

    public void removebook() {

    }


    public void getSerialno() {
        serialno.add("9563854875445");
        serialno.add("9563854665445");
        serialno.add("9563878569455");

    }

    public void price(){
    }

}


