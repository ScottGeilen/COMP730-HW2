public class SumDigitsInString extends H1 {
    /*
        Scan each character of a string and return the sum of all digits in the string.  
        If there are no digits in the string, then the method returns  zero.  
        Use Character.isDigit() to determine if a character is a digit. 
        The main() method in HW1 will call this method twice. 
    */
    public int doWork(String theString) {
        int sum = 0;
        int error = 0;
        for (int i=0; i<theString.length(); i++) {
            if (Character.isDigit(i) == true) {
                sum++;
            } else
                return(error);
        }
        return(sum);
    }
}