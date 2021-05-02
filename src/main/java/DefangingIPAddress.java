/*
    defanging IP addresses: replace all ". with "[.]"
*/
class DefangingIPAddress {
    public String defangIPaddr(String address)
    {
        String replacement = ""; //dummy string to fill in w
        for(int i=0; i<address.length();++i){

            if(address.charAt(i) == '.') replacement += "[.]";
            else replacement += address.substring(i, i+1);
        }
        return replacement;
    }
}