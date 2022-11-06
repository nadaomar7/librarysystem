import java.util.ArrayList;

public class science implements library  {
    public int c=0;


    public science (){}

    public science ( int c){

        this.c=c;
    }

    ArrayList<String> serialno = new ArrayList<>();
    ArrayList <String> authorname = new ArrayList<>();
    ArrayList <String> bookname = new ArrayList<>();
    @Override
    public int countbooks() {

        return c++;
    }

    @Override
    public void addbooks() {
        bookname.add("THE GENE: AN INTIMATE HISTORY ");
        bookname.add("BEING MORTAL: MEDICINE AND WHAT MATTERS IN THE END ");
        bookname.add("THE IMMORTAL LIFE OF HENRIETTA LACKS");
    }

    @Override
    public void removebook() {

    }
    public void addauthors(){
        authorname.add("SIDDHARTHA MUKHERJEE ");
        authorname.add("ATUL GAWANDE");
        authorname.add("REBECCA SKLOOT");
    }
    public void getSerialno() {
        serialno.add("9563854875445");
        serialno.add("9563854665445");
        serialno.add("9563878569455");

    }
    public float price(float x){
        return x*10;
    }
}
