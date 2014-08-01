public class Solution {
    public int lengthOfLastWord(String s) {
 int length=0;
        int lastElePosi = s.length()-1;
        for(;lastElePosi>=0;lastElePosi--){
        	if(s.charAt(lastElePosi)==' '&&length!=0)
        		break;
        	else if(s.charAt(lastElePosi)==' ' && length == 0)
        		continue; 
        	length++;
        }
        //System.out.println("length:"+length);
    	return length;
    }
}
