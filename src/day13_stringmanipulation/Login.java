package day13_stringmanipulation;

public class Login {
public static void main(String[] args) {
	String secretUserName = "admin";
	String secretPassword = "abc123";

	// 2 variables , UserName, Password.
	// make sure they match with secret ones. and Allow login successfully.
	// Whenever login is no successfull, let program tel exact reason
	//why it is not valid
			//user name is not valid
			//password is not valid
			//both user name and password not valid
	
	String userName = "admina"; //u can change types
	String password = "abc1234";// can not change
	
	if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
		System.out.println("Login Successfull. Welcome back!");
		
	}else { 
		if (!userName.equalsIgnoreCase(secretUserName) && !password.equals(secretPassword)) {
			System.out.println("Error.Both user and password are not valid");
			
	}else if(!userName.equalsIgnoreCase(secretUserName)) {
		System.out.println("Error.Username is not valid");
			
	}else {
		System.out.println("Error. Password is not valid");
	}
   }
  }
 }



