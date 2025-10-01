import Tasks.WordSorter;

import static Tasks.CamelCaseBreaker.breakCamelCaseTest;
import static Tasks.ExesAndOs.exesAndOsTest;
import static Tasks.Isograms.isIsogramTest;
import static Tasks.NumberedStrings.numberStringsTest;
import static Tasks.TextMaskify.maskifyTest;
import static Tasks.WordSorter.orderTest;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        maskifyTest();
        isIsogramTest();
        numberStringsTest();
        breakCamelCaseTest();
        exesAndOsTest();

    }


}