class Solution {
    public boolean isPalindrome(String s) {
        
        String in = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        String op = new StringBuilder(in).reverse().toString();

        if(op.equals(in)){
            return true;
        }
        else return false;
    }
}
