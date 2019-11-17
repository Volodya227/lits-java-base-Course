package com.homework13;

public class Main {
    public static void main(String[] args) {
        System.out.println(money(543));
    }

    static char[] append(char[] array, char a) {
        int s = array.length + 1;
        char[] array1 = new char[s];

        for (int d = 0; d < array1.length; d++) {
            if (array.length == d) {
                array1[d] = a;
            } else {
                array1[d] = array[d];
            }
        }
        return array1;
    }

    public static String consonant_and_vowels(String str) {
        char[] verb = str.toCharArray();
        char[] consonant = {'й', 'ц', 'ч', 'в', 'с', 'к', 'м', 'п', 'н', 'р', 'т', 'г', 'ш', 'л', 'б', 'д', 'щ', 'з', 'ж', 'х'};
        char[] vowels = {'у', 'е', 'о', 'и', 'і', 'а', 'я', 'ю', 'є', 'ї'};
        char[] consonant1 = new char[0];
        char[] vowels1 = new char[0];
        for (int i = 0; i < verb.length; i++) {
            for (int a = 0; a < consonant.length; a++) {
                if (verb[i] == consonant[a]) {
                    consonant1 = append(consonant1, consonant[a]);
                }
            }
            for (int a = 0; a < vowels.length; a++) {
                if (verb[i] == vowels[a]) {
                    vowels1 = append(vowels1, vowels[a]);
                }
            }
        }
        char[][] array = {consonant1, vowels1};
        String l = str + "  consonant is   ";
        for (int i = 0; i < array[0].length; i++) {
            l += array[0][i];
        }
        l += "    vowels is   ";
        for (int i = 0; i < array[1].length; i++) {
            l += array[1][i];
        }
        return l;
    }

    static int[] append(int[] array, int a) {
        int s = array.length + 1;
        int[] array1 = new int[s];

        for (int d = 0; d < array1.length; d++) {
            if (array.length == d) {
                array1[d] = a;
            } else {
                array1[d] = array[d];
            }
        }
        return array1;
    }

    public static String money(int money) {
        int money1 = money;
        int[] a = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        int[] c = new int[0];
        int[] x = new int[0];
        int s = 0;
        boolean l = true;
        int cons = a.length - 1;
        for (int For = 0; For <= a.length - 1; For++) {
            if (a[cons] <= money) {
                while (l == true) {
                    if (a[cons] * s <= money && a[cons] * (s + 1) > money) {
                        money -= a[cons] * s;
                        l = false;
                    } else if (a[cons] * s + 1 > money) {
                        s = s - 1;
                    } else if (a[cons] * s < money) {
                        s = s + 1;
                    }
                }
                x = append(x, s);
                c = append(c, a[cons]);
            }
            s = 0;
            l = true;
            cons -= 1;
        }

        int[][] z = {c, x};
        String str = money1 + " = ";
        for (int h = 0; h < z[0].length; h++) {
            str += z[0][h] + "*" + z[1][h] + " + ";
        }
        StringBuffer sb = new StringBuffer(str);
        sb.setLength(str.length() - 2);
        str = sb.toString();
        return str;
    }

}
