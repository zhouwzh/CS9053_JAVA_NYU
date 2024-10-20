
import java.util.HashSet;
public class LongestSubstring {

	public static String longestSubstring(String s) {
		if(s==null || s.length()==0){
			return "";
		}
		int maxlen = 0, start = 0,left = 0;
		HashSet<Character> seen = new HashSet<>();
		for(int right = 0;right<s.length();right++){
			while(seen.contains(s.charAt(right))){
				seen.remove(s.charAt(left));
				left++;
			}
			seen.add(s.charAt(right));
			if(right-left+1>maxlen){
				maxlen = right - left +1;
				start = left;
			}
		}
		return s.substring(start,start+maxlen);
	}
	
	public static void main(String[] args) {
		// String input = "pwwkew";
        String result = longestSubstring(args[0]);
        System.out.println("LongestSubstring: " + result);
	}
}
