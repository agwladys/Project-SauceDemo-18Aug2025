package org.wipro.auto.uo.commonutilities;


import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadtDataJSON
{

	public static String getdata(String key) throws Exception
	{
		
		FileReader fr = new FileReader("./TestData/logindata.json");
		
		JSONParser parser = new JSONParser();
		Object data = parser.parse(fr);
		
		JSONObject jsonob = (JSONObject) data;
		
		return jsonob.get(key).toString();
	}
}
