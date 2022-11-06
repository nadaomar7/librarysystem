import java.util.ArrayList ;
public class arabicromantic extends romantic {
        ArrayList<String> serialno = new ArrayList<String >();
        ArrayList <String> authorname = new ArrayList<String >();
        ArrayList <String> bookname = new ArrayList<String >();
        public arabicromantic()
        {}
        public void addbooks(){
            bookname.add("hepta ");
            bookname.add("you r mine");
            bookname.add("black fits u ");
            bookname.add("cinrella secret");
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
