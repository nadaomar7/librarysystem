
public class romantic implements library {
    public int c=0;
    private String field;
    public romantic (){

    }
    public romantic (String field , int c){
        this.field=field;
        this.c=c;
    }
    // getter
    public String fields(){
        return field;
    }
    //setter
    public void setfields(){
        this.field=field;
    }
    public void section(){
        if (field == "arabic") {
            arabicromantic a = new arabicromantic();
        }
        if (field == "english"){
            englishromantic e = new englishromantic();
        }
    }
    @Override
    public void addbooks() {

    }
    @Override
    public int countbooks() {
        return c;
    }

    @Override
    public void removebook() {

    }

}
