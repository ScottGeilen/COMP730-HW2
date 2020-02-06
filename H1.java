public class H1 extends Comp730830StringUtils {
    public static void main(String[] args) {
        SumDigitsInString sd = new SumDigitsInString();
        IsGrimString gs = new IsGrimString();
        CountVowels cv = new CountVowels();
        
        System.out.println(sd.doWork("on3tw0thr33fourf1v3"));
        System.out.println(sd.doWork("s1xs3v3n31gh7n1n3t3n"));
        System.out.println(gs.doWorkReturnBoolean("grgrgrThegrgrnoisegrgr"));
        System.out.println(gs.doWorkReturnBoolean("grgreattoseeyougrgrimsby"));
        System.out.println(cv.doWork("Try fly by near Rye"));
        System.out.println(cv.doWork("Vowels for pirates: A, E, I, O, U and sometimes Arrrr!"));
    }
}