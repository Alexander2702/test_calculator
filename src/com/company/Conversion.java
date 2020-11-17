package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

    public class Conversion {
        private static final TreeMap<Integer, String> map = new TreeMap();
        private static List<String> roman;

        public Conversion() {
        }

        public static String toRoman(int number) {
            int l = (Integer)map.floorKey(number);
            return number == l ? (String)map.get(number) : (String)map.get(l) + toRoman(number - l);
        }

        public static int toArabic(String number) {
            return roman.indexOf(number);
        }

        static {
            map.put(100, "C");
            map.put(90, "XC");
            map.put(50, "L");
            map.put(40, "XL");
            map.put(10, "X");
            map.put(9, "IX");
            map.put(5, "V");
            map.put(4, "IV");
            map.put(1, "I");
            roman = new ArrayList();
            roman.add("Просто забьем нулевое значение");
            roman.add("I");
            roman.add("II");
            roman.add("III");
            roman.add("IV");
            roman.add("V");
            roman.add("VI");
            roman.add("VII");
            roman.add("VIII");
            roman.add("IX");
            roman.add("X");
        }
    }

