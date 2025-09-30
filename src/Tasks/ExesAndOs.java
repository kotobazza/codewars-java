package Tasks;

/*
* check is string containing the equal number of 'x's and 'o's
* */


public class ExesAndOs {
    public static boolean exesAndOs(String str){
        str = str.toLowerCase();
        return str.chars().filter(x -> x == 'x').count() == str.chars().filter(x -> x == 'o').count();
    }

    public static void exesAndOsTest(){
        assert(exesAndOs("ooxx"));
        assert(!exesAndOs("xooxx"));
        assert(!exesAndOs("xxx23424esdsfvxXXOOooo"));
        assert(exesAndOs(""));

    }
}
