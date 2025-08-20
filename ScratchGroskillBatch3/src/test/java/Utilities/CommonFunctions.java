package Utilities;

import java.util.Random;

public class CommonFunctions {
	
	public static String generateRandomEmail()
	{
		
		  String base = "mahesh";
	        int totalLength = 8;
	        int suffixLength = totalLength - base.length();

	        // Characters allowed in the suffix (lowercase letters + digits)
	        String allowedChars = "abcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();

	        StringBuilder suffix = new StringBuilder();
	        for (int i = 0; i < suffixLength; i++) {
	            int index = random.nextInt(allowedChars.length());
	            suffix.append(allowedChars.charAt(index));
	        }

	        String email = base + suffix + "@gmail.com";
	        return email;
	    }

}
	


