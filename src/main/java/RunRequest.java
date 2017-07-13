public class RunRequest {

	public static void main(String[] args) {
		final Request managerRequest = new Request();
		managerRequest.setQuery(
				"SELECT%20%20DISTINCT%20%3FroleLabel%20%3FroleAltLabel%20%20%3FclassLabel%20%3FclassAltLabel%20%3FroleWikipediaLink%20WHERE%20%7B%20%20%20%20%0A%20%20%3Frole%20wdt%3AP31%2a%7Cwdt%3AP279%2a%20wd%3AQ2462658%20.%0A%20%20%3Frole%20rdfs%3Alabel%20%3FroleLabel.%0A%20%20%0A%20%20%3Frole%20wdt%3AP279%20%3Fclass%20.%0A%20%20%3Fclass%20rdfs%3Alabel%20%3FclassLabel%20.%0A%20%20%0A%20%20OPTIONAL%7B%3Frole%20skos%3AaltLabel%2a%20%3FroleAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FroleAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20OPTIONAL%7B%3Fclass%20skos%3AaltLabel%2a%20%3FclassAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FclassAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%20%20%0A%20%0A%20%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20%0A%20%20filter%20langMatches%28lang%28%3FroleLabel%29%2C%22en%22%29%0A%20%20filter%20langMatches%28lang%28%3FclassLabel%29%2C%22en%22%29%0A%20%20filter%20langMatches%28lang%28%3FclassAltLabel%29%2C%22en%22%29%0A%20%20%0A%7D%20ORDER%20BY%20%3FroleLabel");
		managerRequest.setDataFormat(DataForomat.JSON);
		String result = Caller.run(managerRequest);
		JsonParser.parseResultToMap(result);
		JsonParser.printMapStatistic("managers");
		JsonParser.printAnchorTextData("managersLinks");

		final Request roleRequest = new Request();
		roleRequest.setQuery(
				"%23SELECT%20%20DISTINCT%20%3Frole%20%3FroleLabel%20%3FroleAltLabel%20%3Fclass%20%3FclassLabel%20%3FclassAltLabel%20WHERE%20%7B%0ASELECT%20%20DISTINCT%20%3FroleLabel%20%3FroleAltLabel%20%3FclassLabel%20%3FclassAltLabel%20%3FroleWikipediaLink%20WHERE%20%7B%0A%20%20%3Frole%20wdt%3AP31%2a%7Cwdt%3AP279%2a%20wd%3AQ214339%20.%0A%20%20%0A%20%20%3Frole%20wdt%3AP279%20%3Fclass%20.%0A%20%20%3Fclass%20rdfs%3Alabel%20%3FclassLabel%20.%0A%20%20%0A%20%20OPTIONAL%7B%3Frole%20skos%3AaltLabel%20%3FroleAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FroleAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20OPTIONAL%7B%3Fclass%20skos%3AaltLabel%20%3FclassAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FclassAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20%0A%20%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20%0A%20%20%3Frole%20rdfs%3Alabel%20%3FroleLabel%20.%0A%20%20filter%20langMatches%28lang%28%3FroleLabel%29%2C%22en%22%29%20%20%0A%20%20filter%20langMatches%28lang%28%3FclassLabel%29%2C%22en%22%29%20%20%0A%7D");
		roleRequest.setDataFormat(DataForomat.JSON);

		result = Caller.run(roleRequest);

		JsonParser.parseResultToMap(result);
		JsonParser.printMapStatistic("roles");
		JsonParser.printAnchorTextData("rolesLinks");
		
	}

}
