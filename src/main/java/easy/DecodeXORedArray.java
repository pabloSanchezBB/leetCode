package easy;

class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {

        int[] arr = new int[encoded.length+1];

        //encoded[i] = arr[i] XOR arr[i+1];
        //therefore arr[i+1] = encoded[i] XOR arr[i];  as a recursive definition b/c XOR is it's own inverse
        arr[0] = first;
        //so now we can calculate for the whole array
        for(int i=0;i<encoded.length;++i){
            arr[i+1] = encoded[i]^arr[i];
        }

        return arr;
    }
}
