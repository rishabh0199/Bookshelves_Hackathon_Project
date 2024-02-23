package utilities;

/***************************************
 *                                     *
 * AUTHOR       : Rishabh              *
 * DATE CREATED : 19-FEB-2024          *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/***********************************************************************************
*                                                                                  *
* Class Name     : JsonRead                                                        * 
* Description    : To Read the JSON file from the desired location.                *
*                                                                                  *
************************************************************************************/

public class JsonRead {

	public static JSONParser parser;
	public static JSONObject jsonObject;
	public static Object obj;
	public static String amount;
	public static String recipientName;
	public static String recipientEmail;
	public static String recipientmobile;
	public static String customerName;
	public static String customerEmail;
	public static String customerMobile;
	public static String customerAddress;
	public static String customerPin;
	public static String message;
	public static String correctemail;
	
	public static void readJSONFile() {
		
		try {
			
			parser = new JSONParser();
			obj = parser.parse(new FileReader("./src/test/resources/GiftCardInput.json"));
	        jsonObject = (JSONObject)obj;
	        
	        amount         = (String)jsonObject.get("Amount");
	        recipientName  = (String)jsonObject.get("Recipient_Name");
	        recipientEmail = (String)jsonObject.get("Recipient_Email");
	        recipientmobile = (String)jsonObject.get("Recipient_Mobile");
	        customerName   = (String)jsonObject.get("Customer_Name");
	        customerEmail  = (String)jsonObject.get("Customer_Email");
	        customerMobile = (String)jsonObject.get("Customer_Mobile");
	        customerAddress= (String)jsonObject.get("Customer_Address");
	        customerPin = (String)jsonObject.get("Customer_PinCode");
	        message        = (String)jsonObject.get("Message");
	        
	        correctemail=  (String)jsonObject.get("Correct_email");
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
	 
	}
	
}
