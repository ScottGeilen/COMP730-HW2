public interface Comp730830StringUtils {
    public class SumDigitsInString implements Comp730830StringUtils {
        private stringUtility stringManipulation;

        private static SumDigitsInString instance;

        private SumDigitsInString() {
            stringManipulation = new stringUtility;
        }

        public static SumDigitsInString getInstance() {
            if (instance == null) {
                instance = new SumDigitsInString();
            }
        }
        public int doWork(string theString) {
            stringManipulation.getDescription();
            return 4;
        }
    }
}