package day58_ExceptionHandling02_AkbarClass;

public class UserManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateUserName("6 Ibrahim CyberTek");
		CreateUserName("Ib asda");
		String str = null ; 
		CreateUserName(str);

	}
	
	public  static void CreateUserName(String name) {
	
		try {
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(3));
			
			char[] nameChars = name.toCharArray();
			System.out.println(nameChars[9]);
			
			String[] arrName=name.split("");
			Integer i = Integer.parseInt(arrName[0]);
			System.out.println(i);
			
		}catch(NullPointerException e) {
			System.out.println("caught NullPointerException ");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("caught StringIndexOutOfBoundsException ");
		}catch(NumberFormatException e) {
			System.out.println("caught NumberFormatException ");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught ArrayIndexOutOfBoundsException ");  
		} finally {
			System.out.println(" this is finally block !!!");
		}
	
		
	}

}
