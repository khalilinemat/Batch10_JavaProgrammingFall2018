package day33_MethodWithReturn02;

public class StringMethod02Teacher {

	
	public static void main(String[] args) {
		
		
		int c = countT("Javava", "a"); 
		System.out.println(c);
		
			System.out.println( countTimesV2("javava","a") );
//			
//			System.out.println( countTimesV3("abc1234ppo", "o") );
		}
		
		/*Method name: countTimes
		 * Params: 2 Strings
		 * Return type: int
		 * Counts number of second string within first string 
		 * and return that count
		 * 
		 * Ex:
		 * countTimes("jav","a") -> 2
		 * countTimes("Break time is over!", "e" ) -> 3
		 * countTimes("google", "a" ) -> 0
		 */
	
	
		public static int count(String a, String b) {
			
			int count = 0; 
			
			for (int idx = 0; idx < a.length(); idx++) {
				
				if (a.substring(idx, idx+1).contains(b)) {
					
					count++; 
				}
			}
			
			return count; 
		}
		
		public static int countT(String s1, String s2) {
			
			int counter = 0; 
			for (int idx = 0; idx < s1.length(); idx++) {
				
				if (s1.substring(idx, idx+1).contains(s2)) {
					counter++; 
				}
			}
			
			return counter; 
		}

		public static int countTimes(String str1, String str2) {
			int counter = 0;
			
			for(int i = 0; i < str1.length(); i++) {
				if(str1.substring(i, i+1).equals(str2)) {
					counter++;
				}
			}

			return counter;
		}
		
		//String str = "abcabc"; str.split("b"); -> ["a","ca", "c"] -> length->3.b s are 2
		//TODO: update this method so that it handles when str2 is at the end| start
		
		public static int countTimesV2(String str1, String str2) {
			
			String[] arr = str1.split(str2);
			
			return arr.length-1;
		}
		
		//"java" ,"a" -> "jv" -> 2. 
		
		public static int countTimesV3(String str1, String str2) {
			int len1 = str1.length(); //4
			str1 = str1.replace(str2, "");
			int len2 = str1.length(); //2
			return len1 - len2;
		}
			
}
