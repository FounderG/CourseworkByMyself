package Service;

/**
 * Created by gaoyiming on 2017/5/25.
 */
public class CharacterParser {
    /**
     * The Char-Digit parser
     *
     * @param row
     * @return the row with digit format
     */
    public static int getRowWithChar(String row) {
        switch (row) {
            case "A":
                return 1;

            case "B":
                return 2;

            case "C":
                return 3;

            case "D":
                return 4;

            case "E":
                return 5;

            case "F":
                return 6;

        }

        return 0;
    }

    /**
     * the String-Digit parser
     *
     * @param type
     * @return the ticket type with string format
     */
    public static String getTicketTypeWithNum(int type) {
        switch (type) {
            case 1:
                return "Child";
            case 2:
                return "Adult";
            case 3:
                return "Senior";
            case 4:
                return "Student";
        }

        return "";
    }

    /**
     * The String-Digit parser
     *
     * @param row
     * @return the row with String format
     */
    public static String getRowWithNum(int row) {
        switch (row) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return "E";
            case 6:
                return "F";
        }

        return "";
    }

    /**
     * This method is incomplete, please make sure that the movieID will not reach the number "10"
     *
     * @param movieID
     * @return
     */
    public static int getIndexWithMovieID(String movieID) {
        String[] nums = movieID.split("");

        return Integer.parseInt(nums[3]);
    }
}
