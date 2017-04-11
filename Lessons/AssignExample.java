/**
 * Created by Andrey on 11.04.2017.
 */
public class AssignExample {
    public static void main (String[] args) {
        int var1;
        int var2;

        var1 = 4096;
        var2 = var1;

        var1 = var1/2;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = var1/4 = " + var2);
        if (var1<var2) {
            System.out.println("var1<var2");
            //var1 = var1 - 2;
        } else {
            System.out.println("var1>var2");
        }

        // switch compares var2 with constants in "cases" and runs not only the case that is equal to var2, but all cases below as well, so break is recommended
        switch(var2) {
            case 4095: System.out.println("var2 == 4095"); break;
            case 4096: System.out.println("var1 == 4096"); break;
            case 4097: System.out.println("var1 == 4097"); break;
            // duplicate case label // case 4096: System.out.println("var1 == 4096!!!");
            // constant expression required // case 2*var1: System.out.println("var2==2var1");
            default: System.out.println("var1?"); break;
        }
    }
}
