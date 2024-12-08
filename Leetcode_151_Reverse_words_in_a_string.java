public class Main {
    public static void main(String[] args) {

        String test = "a good   example";
        test = reverseWords(test);
        System.out.println(test);

    }

    public static String reverseWords(String s) {

        //  Split the words from the string, iterate over it from back to front copying it to result string
        String resultString = "";

        String[] strippedList = s.split("\\s+");

        for (int i = strippedList.length - 1; i >= 0; i--) {
            resultString =  resultString.concat(strippedList[i]);
            resultString = resultString.concat(" ");
        }

        resultString = resultString.trim();

        return resultString;

    }
}
