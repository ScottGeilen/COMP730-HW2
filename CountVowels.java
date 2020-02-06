public class CountVowels extends H1 {
    /*
        This method returns the number of vowels in a string.
        Vowels are the letters a,e,i,o,u.  
        If there are no vowels, return 0.
        The main method from the HW1 class will call this method twice.
        Call the doWork() method with these strings:  "Try fly by near Rye" and "Vowels for pirates: A, E, I, O, U and sometimes Arrrr!"
    */
    public int doWork(String theString) {
        String lowerCaseString = theString.toLowerCase();
        int count = 0;
        for (int i=0; i<lowerCaseString.length(); ++i) {
            String index = lowerCaseString.valueOf(i);
            if (index == "a" || 
                index == "e" || 
                index == "i" || 
                index == "o" || 
                index == "u") {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
        return count;
    }
}