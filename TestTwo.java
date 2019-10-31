package testing;
public class TestTwo {

    String[] romanArray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] romanDecArray = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
    int[] arabArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Boolean[] isRoman = new Boolean[2];

    public Boolean[] isRoman(String[] a) throws NumberFormatException {

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < romanArray.length; k++) {
                //if (a.equals(romanArray[i]) == true)? isRoman=true: isRoman = false;
                if (a[i].equals(romanArray[k]) == true) {
                    isRoman[i] = true;
                    break;
                } else {
                    isRoman[i] = false;
                }
            }
        }
        if (isRoman[0] != isRoman[1]) {
            throw new NumberFormatException("Invalid input format! Enter identical data.");
        }
        return isRoman;
    }

    int[] convertM = {15,15};

    public int[] converIntoNumeric(String[] a, Boolean[] b) {
        for (int i = 0; i < a.length; i++) {
            if (b[i] == true) {
                for (int k = 0; k < romanArray.length; k++) {
                    if (a[i].equals(romanArray[k]) == true) {
                        convertM[i] = arabArray[k];
                        break;
                    }
                }
            } else {
                for (int k = 0; k < arabArray.length; k++) {
                    if (a[i].equals(String.valueOf(arabArray[k])) == true) {
                        convertM[i] = arabArray[k];
                        break;
                    }
                }
            }
        }
        if (convertM[0] ==15 || convertM[0] ==15) {
            throw new NumberFormatException("Invalid input format! Enter right parameters (integer and not more than 10).");
        }
        return convertM;
    }

    public String convertIntoRoman (int result) {
        int decate = result/10;
        int one = result%10;
        String resInRoman = "";
        for (int k =0; k<romanDecArray.length; k++) {
            if (decate == arabArray[k]) {
                resInRoman += romanDecArray[k];
            }
        }
        for (int i =0; i<romanDecArray.length; i++) {
            if (one == arabArray[i]) {
                resInRoman += romanArray[i];
            }
        }
        return resInRoman;
    }
}
