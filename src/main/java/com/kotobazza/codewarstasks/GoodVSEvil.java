package main.java.com.kotobazza.codewarstasks;

import java.util.stream.IntStream;

public class GoodVSEvil {

    private static final String GoodWins = "Battle Result: Good triumphs over Evil";
    private static final String EvilWins = "Battle Result: Evil eradicates all trace of Good";
    private static final String TieResult = "Battle Result: No victor on this battle field";

    private static final int[] GoodRaces = new int[]{1, 2, 3, 3, 4, 10};

    private static final int[] EvilRaces = new int[]{1, 2, 2, 2, 3, 5, 10};



    public static String battle(String goodAmounts, String evilAmounts){
        String[] goodAmountSplit = goodAmounts.split(" ");
        String[] evilAmountSplit = evilAmounts.split(" ");

        int goodPowers = IntStream
                            .range(0, goodAmountSplit.length)
                            .map(i -> Integer.parseInt(goodAmountSplit[i]) * GoodRaces[i])
                            .sum();
        int evilPowers = IntStream
                            .range(0, evilAmountSplit.length)
                            .map(i -> Integer.parseInt(evilAmountSplit[i]) * EvilRaces[i])
                            .sum();

        if(evilPowers>goodPowers) return EvilWins;
        else if(goodPowers>evilPowers) return GoodWins;
        else return TieResult;
    }
}
