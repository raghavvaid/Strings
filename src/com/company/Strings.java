package com.company;

public class Strings {

    public static String scroll(String input) {
        String x = input.substring(1) + input.charAt(0);
        return x;
    }

    public static String convertName(String name){
        int x = name.indexOf(',');
        String first = name.substring(x + 1).trim();
        String last = name.substring(0, x).trim();
        return first + " " + last;
    }


    public static String negString(String input){
        String output = input.replace("1", "X");
        output = output.replace("0", "1");
        output = output.replace("X", "0");
        return output;
    }


    public static String convertDate(String datestr){
        int x = datestr.indexOf('/');
        int y = datestr.indexOf('/', x + 1);
        String date = datestr.substring(x + 1, y) + "-" + datestr.substring(0,x) + "-" + datestr.substring(y + 1);
        return date;
    }


    public static String convertDate2(String datestr){
        int x = datestr.indexOf('/');
        int y = datestr.indexOf('/', x + 1);

        String day, month;
        if (y - x == 2) {
            day = "0" + datestr.substring(x + 1, y);
        }
        else {
            day = datestr.substring(x + 1, y);
        }
        if (x == 1){
            month = "0" + datestr.substring(0,x);
        }
        else {
            month = datestr.substring(0,x);
        }

        String date = day + "-" + month + "-" + datestr.substring(y + 1);
        return date;

    }

    public static boolean startsWith(String s, String prefix){
        int x = prefix.length();
        int y = s.length();
        if (x>y) return false;
        return s.substring(0, x).equals(prefix);

    }

    public static boolean endsWith(String s, String suffix){
        int x = suffix.length();
        int y = s.length();
        if(x>y) return false;
        return s.substring(y-x).equals(suffix);
    }

    public static String removeTag(String s, String tag){
        String beg = "<"+tag+">";
        String end = "</"+tag+">";
        int x = beg.length();
        int y = s.indexOf(beg);
        int ending = s.indexOf(end, y+1);

        if(ending == -1) return s;
        if(y == -1) return s;
        return s.substring(y+x,ending);
    }



    public static void main(String[] args) {
        System.out.println("Scroll: ");
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));
        System.out.println();

        System.out.println("convertName: ");
        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));
        System.out.println();

        System.out.println("negString: ");
        System.out.println(negString("0010111001"));
        System.out.println(negString("11111111"));
        System.out.println();

        System.out.println("convertDate: ");
        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));
        System.out.println();

        System.out.println("convertDate2: ");
        System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));

        System.out.println("\nstartsWith:");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("\nendsWith:");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("\nremoveTag:");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));

    }
}