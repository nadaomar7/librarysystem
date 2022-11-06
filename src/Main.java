public class Main {
    public static void main(String[] args) {
        romantic  r1 = new romantic ("arabic",0);
        romantic r2 = new romantic ("english",0);
        r1.section();
        r1.countbooks();
        r1.removebook();
        r1.addbooks();
        englishromantic e1 = new englishromantic();
        arabicromantic a1= new arabicromantic();
        e1.addtocart();
        e1.buyit();
        e1.cashorvisa();
        e1.confirmorder();
        a1.addtocart();
        a1.buyit();
        a1.cashorvisa();
        a1.confirmorder();
        /////////////////
        child c1 = new child();
        child c2 = new child(5);
        c1.addauthors();
        c1.addbooks();
        c1.price();
        //System.out.println(c1);
        c1.countbooks();
        c1.removebook();
        c2.addauthors();
        c2.addbooks();
        c2.price();
        //System.out.println(c2);
        c2.countbooks();
        c2.removebook();
        religion rel1 = new religion();
        religion rel2 = new religion (25);
        rel1.countbooks();
        rel1.removebook();
        rel1.addauthors();
        rel1.addbooks();
        rel1.price(80);
        rel2.countbooks();
        rel2.removebook();
        rel2.addauthors();
        rel2.addbooks();
        rel2.price(52);
        science s1 = new science();
        science s2 = new science (55);
        s1.countbooks();
        s1.removebook();
        s1.addauthors();
        s1.addbooks();
        s1.price(88);
        s2.countbooks();
        s2.removebook();
        s2.addauthors();
        s2.addbooks();
        s2.price(42);
    }

    private static class String {
    }
}

