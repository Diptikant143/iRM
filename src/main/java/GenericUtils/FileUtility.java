package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;


public class FileUtility {
	public String getPropertyKeyValue(String Key) throws Throwable {
		FileInputStream file=new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(Key);
	}
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	/**public String getJsonKeyValue(String jsonKey) throws Throwable {
		FileReader reader = new FileReader(IPathConstant.JSONFILEPATH);
		JSONParser parser=new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonObject =(JSONObject)object;
		String value =jsonObject.get(jsonKey).toString();
		return value;
	}
	**/

	
		
	}

