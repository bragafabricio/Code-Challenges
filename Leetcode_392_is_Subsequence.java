class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder wholeString = new StringBuilder(t);
        StringBuilder subString = new StringBuilder(s);
        int j = 0;
        if (subString.length() == 0){
            return true;
        }

        for (int i = 0; i < t.length(); i++) {
            if (wholeString.charAt(i) == subString.charAt(j%(subString.length()))) {
                j++;
            }
        }

        if (j >= s.length()) {
            return true;
        }

        return false;

    }
}
