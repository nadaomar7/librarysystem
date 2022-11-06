import java.util.ArrayList ;
public class englishromantic extends romantic {
    ArrayList <String> serialno = new ArrayList<String >();
    ArrayList <String> authorname = new ArrayList<String >();
    ArrayList <String> bookname = new ArrayList<String >();
    public englishromantic(){}
    public void addbooks(){
        bookname.add("The fault in our stars");
        bookname.add("The notebook");
        bookname.add("Jane eyre");

    }
    public void addauthors(){
        authorname.add("william shakspere ");
        authorname.add("nickolas sparks");
        authorname.add("charles dickens");
    }
    public void addtocart(){

    }
    public void buyit(){

    }
    public String cashorvisa(){
        return "cash";
    }
    public double confirmorder(){
        return 0;
    }

}
