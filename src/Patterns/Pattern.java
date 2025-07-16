package Patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
        System.out.println();
        pattern6();
        System.out.println();
        pattern7();
        System.out.println();
        pattern8();
        System.out.println();
        pattern9();
        System.out.println();
        pattern10();
        System.out.println();
        pattern11();
        System.out.println();
        pattern12();
        System.out.println();
        pattern13();
        System.out.println();
        pattern14();
        System.out.println();
        pattern15();
        System.out.println();
        pattern17();
        System.out.println();
        pattern18();
        System.out.println();
        pattern19();
        System.out.println();
        pattern20();
//        System.out.println();
//        pattern21(); //?
//        System.out.println();
//        pattern22();
//        System.out.println();
//        pattern23(); //?
//        System.out.println();
//        pattern24();
//        System.out.println();
//        pattern26();
//        System.out.println();
//        pattern28();
//        System.out.println();
        pattern30();
        System.out.println();
        //=================================================
//        pattern5ByKunal();
//        pattern12ByKunal();
    }

    static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6() {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j == i || j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern7() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i || j > i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern8() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j >= 5 - i && j <= 5 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= 9; j++) {
                if (j >= 5 - i && j <= 5 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern10() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((j <= 5 + i && j >= 5 - i) && (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern11() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= 9; j++) {
                if ((j >= 5 - i && j <= 5 + i) && ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= 9; j++) {
                if ((j >= 5 - i && j <= 5 + i) && ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((j >= 5 - i && j <= 5 + i) && ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern13() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5 - i || j == 5 + i || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= 9; j++) {
                if (i == 4 || (j == 5 - i || j == 5 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern15() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5 + i || j == 5 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5 - i || j == 5 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern17() {
        for (int i = 0; i < 4; i++) {
            int val = i + 1;
            for (int j = 1; j <= 7; j++) {
                if (j == 4) {
                    System.out.print(val);
                } else if (j >= 4 - i && j < 4) {
                    System.out.print(val);
                    val--;
                } else if (j <= 4 + i && j > 4) {
                    val++;
                    System.out.print(val);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i >= 0; i--) {
            int value = i + 1;
            for (int j = 1; j <= 10; j++) {
                if (j == 4) {
                    System.out.print(1);
                } else if (j >= 4 - i && j <= 4) {
                    System.out.print(value);
                    value--;
                } else if (j > 4 && j <= 4 + i) {
                    value++;
                    System.out.print(value);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static void pattern18() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= 5 + i && j > 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= 10; j++) {
                if (j > 5 - i && j <= 5 + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern19() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= 10; j++) {
                if (j <= 5 - i || j > 5 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j <= 5 - i || j > 5 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern20() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 0 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern21() {
        int val = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%3d", val);
                val++;
            }
            System.out.println();
        }
    }

    static void pattern22() {
        int val = 0;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                val = 1;
            } else {
                val = 0;
            }
            for (int j = 0; j <= i; j++) {
                if (val == 0) {
                    System.out.print(val + " ");
                    val = 1;
                } else {
                    System.out.print(val + " ");
                    val = 0;
                }
            }
            System.out.println();
        }
    }

    static void pattern23() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i == 1 && j == 3) || (i == 1 && j == 7)) {
                    System.out.printf("%2s", "*");
                }
                if ((i == 2 && j == 2) || (i == 2 && j == 4) || (i == 2 && j == 6) || (i == 2 && j == 8)) {
                    System.out.printf("%2s", "*");
                }
                if ((i == 3 && j == 1) || (i == 3 && j == 5) || (i == 3 && j == 9)) {
                    System.out.printf("%2s", "*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern24() {
        int start = 1;
        int end = 10;
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == start || j == end || j == start + i || j == end - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern26() {
        int val = 1;
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
            }
            val++;
            System.out.println();
        }
    }

    static void pattern28() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i % 2 == 0 && (j <= 5 + i && j >= 5 - i) && j % 2 != 0) {
                    System.out.print("*");
                } else if (i % 2 != 0 && (j <= 5 + i && j >= 5 - i) && j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 1; j <= 9; j++) {
                if (i % 2 != 0 && (j <= 5 + i && j >= 5 - i) && j % 2 == 0) {
                    System.out.print("*");
                } else if (i % 2 == 0 && (j <= 5 + i && j >= 5 - i) && j % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern30() {

        for (int i = 0; i < 5; i++) {
            int val = i + 1;
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    System.out.print(" "+val + " ");
                } else if (j < 5 && j >= 5 - i) {
                    System.out.print(" "+val);
                    val--;
                } else if (j > 5 && j <= 5 + i) {
                    val++;
                    System.out.print(val + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //=================================================================================================================

    static void pattern5ByKunal(){
        int n=5;
        int row=(2*n)-1;
        for(int i=1;i<=row;i++){
            int col= i>n?2*n-i:i;
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern12ByKunal(){
//        int n=5;
//        int row=2*n;
//        for(int i=0;i<row;i++){
//            for(int j=1;j<=row;j++){
//                if(i<n && i%2!=0 ){
//
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}