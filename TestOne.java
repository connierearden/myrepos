package testing;
import java.util.Scanner;

public class TestOne extends TestTwo{

    public String action = "";
    public String [] mainM = new String[2];

    public TestOne (String testStr) {
        String test1 = testStr.replace(" ","");
        String [] charM = {"+","-","*","/"};
        int indexZ = 0;
        for (int i = 0; i<charM.length; i++) {
            if (test1.contains(charM[i])) {
                indexZ = test1.indexOf(charM[i]);
                this.action = charM[i];
                break;
                //action = Integer.parseInt(charM[i]);
            }
        }
        if (action =="") {throw new NumberFormatException("Add action!");}
        this.mainM[0] = test1.substring(0, indexZ);
        this.mainM[1] = test1.substring(indexZ+1);
    }
    public int result (int[] m, String act) {
        int a = m[0];
        int b = m[1];
        int c = 0;
        switch (act) {
            case ("+"): c = a+b; break;
            case ("-"): c = a-b; break;
            case ("*"): c = a*b; break;
            case ("/"): c = a/b; break;
            default: System.out.println("mistake"); break;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testStr = scanner.nextLine().toUpperCase();
        TestOne res = new TestOne(testStr);
        int [] re = res.converIntoNumeric(res.mainM,res.isRoman(res.mainM));
        int result = res.result(re,res.action);
        if (res.isRoman[0] == true) {
                System.out.println(res.convertIntoRoman(result));
            } else {
                System.out.println(result);
        }
    }
}
