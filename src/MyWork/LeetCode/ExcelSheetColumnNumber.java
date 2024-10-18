package MyWork.LeetCode;

import java.security.PublicKey;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int columnNumber = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int currentValue = columnTitle.charAt(i) - 'A' + 1;

            columnNumber = columnNumber * 26 + currentValue;
        }

        return columnNumber;
    }
}
