package hu.petrik.Stack;

public class TukorSzoEllenorzo {

    private static String szo;
    private static Stack<Character> verem;

    public static boolean Run(String beolvasottSzo) {
        szo = beolvasottSzo;
        verem = new Stack<>();

        return false;
    }

    private static boolean isTukorSzoE(String szo) {
        verem.empty();

        for (int i = 0; i < szo.length(); i++) {
            verem.push(szo.charAt(i));
        }

        int index = szo.length()/2 + szo.length()%2;

        while (index < szo.length() && szo.charAt(index) == verem.pop()) {
            index++;
        }

        return index== szo.length();
    }

    public static boolean isPalindromE(String mondat) {
        String ujMondat = mondat;
        String[] irasjelek = {".", "!", "?", ":", "-" , "_", " ", "'", "\""};

        for (String irasjel: irasjelek) {
            ujMondat = ujMondat.replaceAll(irasjel+"", "");
        }
        ujMondat = ujMondat.toUpperCase();

        return isTukorSzoE(ujMondat);
    }

}
