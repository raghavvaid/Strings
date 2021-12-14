package com.company;

public class Sentence {

    private String currSent;

    /** Constructs a new Sentence object. */
    public Sentence(String p) {
        currSent = p;
    }

    /** Returns a string containing the current sentence. */
    public String toString() {
        return currSent;
    }


    public int findNthTime(String str, int n) {
        int x = -1;
        for (int i = 0; i < n; i++){
            x = currSent.indexOf(str, x+1);
            if (x == -1) return -1;
        }
        return x;
    }



    public void replaceNthTime(String str, int n, String repl) {
        /*  part b - you must call findNthTime here */
    }


    public int findLastTime(String str) {
        /* part c - you must call findNthTime here */
        return -1;  // replace this
    }

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("A cat ate late.");
        System.out.println(sentence1.findNthTime("at",1));
        sentence1.replaceNthTime("at", 1, "rane");
        System.out.println(sentence1);

        Sentence sentence2 = new Sentence("A cat ate late.");
        System.out.println(sentence2.findNthTime("at",6));
        sentence2.replaceNthTime("at", 6, "xx");
        System.out.println(sentence2);

        Sentence sentence7 = new Sentence("A cat ate late.");
        System.out.println(sentence7.findNthTime("at",3));
        sentence7.replaceNthTime("at", 3, "xx");
        System.out.println(sentence7);

        Sentence sentence3 = new Sentence("A cat ate late.");
        System.out.println(sentence3.findNthTime("bat",2));
        sentence3.replaceNthTime("bat", 2, "xx");
        System.out.println(sentence3);

//        Sentence sentence4 = new Sentence("aaaa");
//        sentence4.replaceNthTime("aa", 1, "xx");
//        System.out.println(sentence4);
//
//        Sentence sentence5 = new Sentence("aaaa");
//        sentence5.replaceNthTime("aaa", 2, "bbb");
//        System.out.println(sentence5);
//
//        Sentence sentence6 = new Sentence("A cat ate late.");
//        System.out.println(sentence6.findLastTime("at"));
//        System.out.println(sentence6.findLastTime("cat"));
//        System.out.println(sentence6.findLastTime("bat"));
    }

}