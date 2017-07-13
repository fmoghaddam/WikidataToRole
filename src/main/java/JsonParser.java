import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParser {
	
	private static Map<String,Set<String>> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	
	public static void parseResultToMap(final String result){
		map.clear();
		final JSONObject obj = new JSONObject(result);
		final JSONObject pageName = obj.getJSONObject("results");

		final JSONArray arr = pageName.getJSONArray("bindings");
		
		for (int i = 0; i < arr.length(); i++) {
			final String roleLabel = arr.getJSONObject(i).getJSONObject("roleLabel").getString("value");		
			final String classLabel = arr.getJSONObject(i).getJSONObject("classLabel").getString("value");
			
			String classAltLabel = "";
			String roleAltLabel ="";
			
			try{
				classAltLabel = arr.getJSONObject(i).getJSONObject("classAltLabel").getString("value");
				roleAltLabel = arr.getJSONObject(i).getJSONObject("roleAltLabel").getString("value");
			}catch (JSONException e) {				
			}
			
			addToMap(roleLabel,classLabel,roleAltLabel,classAltLabel);
		}
		
	}
	
	public static void printMapStatistic(final String folderName) {
		System.err.println("Number of Category for "+folderName+" = "+map.size());
		for(Entry<String, Set<String>> a:map.entrySet()){
			try{
			    PrintWriter writer = new PrintWriter(folderName+File.separator+a.getKey(), "UTF-8");
			    for(String s:a.getValue()){
			    	if(s.isEmpty()){
			    		continue;
			    	}
			    	writer.println(s);
			    }
			    writer.close();
			} catch (IOException e) {
			   // do something
			}
			
		}
	}
	
	private static void addToMap(String roleLabel, String classLabel, String roleAltLabel, String classAltLabel) {
		if(classLabel==null || classLabel.isEmpty()){
			return;
		}
		final Set<String> value = map.get(classLabel);
		if(value==null){
			final Set<String> set = new HashSet<>();
			set.add(roleLabel);
			set.add(roleAltLabel);
			//set.add(classAltLabel);
			map.put(classLabel, set);
		}else{
			final Set<String> set = new HashSet<>(value);
			set.add(roleLabel);
			set.add(roleAltLabel);
			//set.add(classAltLabel);
			map.put(classLabel, set);
		}
	}

}
