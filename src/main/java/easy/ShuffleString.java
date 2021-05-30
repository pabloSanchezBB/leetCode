package easy;

/*
    Take a String s and an int[] indices which contain, respectively, a message and the order the chars of the message should be arranged in. For example, say s.charAt(0) == 'e' and indices[0] == 4, that means 'e' needs to be placed at index 4 of the returned String. Shuffle the string so the characters in s are arranged in an ascending order of indices
*/
class ShuffleString{
    public String restoreString(String s, int[] indices) {
        if(s.length() != indices.length) return "Error";

        char[] toReturn = new char[indices.length];

        for(int i=0;i<indices.length;++i){
            toReturn[indices[i]] = s.charAt(i);
        }

        return new String(toReturn);
    }
}
