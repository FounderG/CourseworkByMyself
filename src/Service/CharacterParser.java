package Service;

/**
 * Created by gaoyiming on 2017/5/25.
 */
public class CharacterParser {
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
}
