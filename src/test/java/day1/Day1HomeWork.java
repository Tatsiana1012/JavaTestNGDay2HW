package day1;

import org.testng.annotations.Test;

public class Day1HomeWork {

    @Test
    public void test001(){

        String s1 = "H";
        int a = 3110;
        String s2 = " w0r1d";
        String s3 = " ";
        double b = 2.0;
        boolean c = true;{

            System.out.println(s1 + a + s3 + s2 + s3 + b + s3 + c);
        }

    }


    @Test
    public void test003LW() {
        int i = 10;

        while(i < 16) {
            System.out.println( i );
            i++;
        }
    }

    @Test
    public void test003LDW() {
        int i = 10;

        do {
            System.out.println(i);
            i++;
        }
        while (i < 16);
    }

    @Test
    public void testHW () {
        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
                743, 527};

        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];

            if (x == 237) {
                break;
            }

            if (x % 2 == 0) {
                System.out.println(x);

            }

        }
    }


    }







