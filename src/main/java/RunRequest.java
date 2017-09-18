public class RunRequest {

	public static void main(String[] args) {
//		final Request managerRequest = new Request();
//		managerRequest.setQuery(
//				"SELECT%20%20DISTINCT%20%3FroleLabel%20%3FroleAltLabel%20%20%3FclassLabel%20%3FclassAltLabel%20%3FroleWikipediaLink%20WHERE%20%7B%20%20%20%20%0A%20%0A%20%20%3Frole%20wdt%3AP31%2a%7Cwdt%3AP279%2a%20wd%3AQ25713832%20.%0A%20%20wd%3AQ25713832%20rdfs%3Alabel%20%3FLEADER_OF_ORGANIZATION%20.%0A%20%20%3Frole%20rdfs%3Alabel%20%3FroleLabel.%0A%20%20%0A%20%20%3Frole%20wdt%3AP279%20%3Fclass%20.%0A%20%20%3Fclass%20rdfs%3Alabel%20%3FclassLabel%20.%0A%20%20%0A%20%20OPTIONAL%7B%3Frole%20skos%3AaltLabel%2a%20%3FroleAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FroleAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20OPTIONAL%7B%3Fclass%20skos%3AaltLabel%2a%20%3FclassAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FclassAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%20%20%0A%20%0A%20%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20FILTER%20%28%3FclassLabel%3D%3FLEADER_OF_ORGANIZATION%29%0A%20%20filter%20langMatches%28lang%28%3FroleLabel%29%2C%22en%22%29%0A%20%20filter%20langMatches%28lang%28%3FclassLabel%29%2C%22en%22%29%0A%20%20filter%20langMatches%28lang%28%3FclassAltLabel%29%2C%22en%22%29%0A%20%20%0A%7D%20ORDER%20BY%20%3FroleLabel");
//		managerRequest.setDataFormat(DataForomat.JSON);
//		String result = Caller.run(managerRequest);
//		JsonParser.parseResultToMap(result);
//		//JsonParser.printMapStatistic("managers");
//		JsonParser.aggegateAndPrintMapStatistic("./roles/ceo");
//		//JsonParser.printAnchorTextData("managersLinks");
//		JsonParser.aggegateAndPrintAnchorTextData("./rolesLinks/ceo");
//
//		
//		final Request presidentRequest = new Request();
//		presidentRequest.setQuery(
//				"SELECT%20%20DISTINCT%20%3FroleLabel%20%3FroleAltLabel%20%3FclassLabel%20%3FclassAltLabel%20%3FroleWikipediaLink%20WHERE%20%7B%0A%20%20%3Frole%20wdt%3AP31%2a%7Cwdt%3AP279%2a%20wd%3AQ30461%20.%0A%20%20%0A%20%20%3Frole%20wdt%3AP279%20%3Fclass%20.%0A%20%20%3Fclass%20rdfs%3Alabel%20%3FclassLabel%20.%0A%20%20%0A%20%20OPTIONAL%7B%3Frole%20skos%3AaltLabel%20%3FroleAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FroleAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20OPTIONAL%7B%3Fclass%20skos%3AaltLabel%20%3FclassAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FclassAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20%0A%20%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20%0A%20%20%3Frole%20rdfs%3Alabel%20%3FroleLabel%20.%0A%20%20filter%20langMatches%28lang%28%3FroleLabel%29%2C%22en%22%29%20%20%0A%20%20filter%20langMatches%28lang%28%3FclassLabel%29%2C%22en%22%29%20%20%0A%7D");
//		presidentRequest.setDataFormat(DataForomat.JSON);
//		result = Caller.run(presidentRequest);
//		JsonParser.parseResultToMap(result);
//		//JsonParser.printMapStatistic("roles/president");
//		JsonParser.aggegateAndPrintMapStatistic("roles/president");
//		//JsonParser.printAnchorTextData("rolesLinks/president");
//		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/president");
//		
//		final Request chancellorRequest = new Request();
//		chancellorRequest.setQuery(
//				"SELECT%20%20DISTINCT%20%3FroleLabel%20%3FroleAltLabel%20%3FclassLabel%20%3FclassAltLabel%20%3FroleWikipediaLink%20WHERE%20%7B%0A%20%20%3Frole%20wdt%3AP31%2a%7Cwdt%3AP279%2a%20wd%3AQ373085%20.%0A%20%20%0A%20%20%3Frole%20wdt%3AP279%20%3Fclass%20.%0A%20%20%3Fclass%20rdfs%3Alabel%20%3FclassLabel%20.%0A%20%20%0A%20%20OPTIONAL%7B%3Frole%20skos%3AaltLabel%20%3FroleAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FroleAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20OPTIONAL%7B%3Fclass%20skos%3AaltLabel%20%3FclassAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FclassAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20%0A%20%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20%0A%20%20%3Frole%20rdfs%3Alabel%20%3FroleLabel%20.%0A%20%20filter%20langMatches%28lang%28%3FroleLabel%29%2C%22en%22%29%20%20%0A%20%20filter%20langMatches%28lang%28%3FclassLabel%29%2C%22en%22%29%20%20%0A%7D");
//		chancellorRequest.setDataFormat(DataForomat.JSON);
//		result = Caller.run(chancellorRequest);
//		JsonParser.parseResultToMap(result);
//		//JsonParser.printMapStatistic("roles/chancellor");
//		JsonParser.aggegateAndPrintMapStatistic("roles/chancellor");
//		//JsonParser.printAnchorTextData("rolesLinks/chancellor");
//		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/chancellor");
//		
//		final Request popeRequest = new Request();
//		popeRequest.setQuery(
//				"SELECT%20%20DISTINCT%20%3FroleLabel%20%3FroleAltLabel%20%3FclassLabel%20%3FclassAltLabel%20%3FroleWikipediaLink%20WHERE%20%7B%0A%20%20%3Frole%20wdt%3AP31%2a%7Cwdt%3AP279%2a%20wd%3AQ19546%20.%0A%20%20%0A%20%20%3Frole%20wdt%3AP279%20%3Fclass%20.%0A%20%20%3Fclass%20rdfs%3Alabel%20%3FclassLabel%20.%0A%20%20%0A%20%20OPTIONAL%7B%3Frole%20skos%3AaltLabel%20%3FroleAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FroleAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20OPTIONAL%7B%3Fclass%20skos%3AaltLabel%20%3FclassAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FclassAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20%0A%20%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20%0A%20%20%3Frole%20rdfs%3Alabel%20%3FroleLabel%20.%0A%20%20filter%20langMatches%28lang%28%3FroleLabel%29%2C%22en%22%29%20%20%0A%20%20filter%20langMatches%28lang%28%3FclassLabel%29%2C%22en%22%29%20%20%0A%7D");
//		popeRequest.setDataFormat(DataForomat.JSON);
//		result = Caller.run(popeRequest);
//		JsonParser.parseResultToMap(result);
//		//JsonParser.printMapStatistic("roles/pope");
//		JsonParser.aggegateAndPrintMapStatistic("roles/pope");
//		//JsonParser.printAnchorTextData("rolesLinks/pope");
//		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/pope");
//		
//		final Request kingRequest = new Request();
//		kingRequest.setQuery(
//				"SELECT%20%20DISTINCT%20%3FroleLabel%20%3FroleAltLabel%20%3FclassLabel%20%3FclassAltLabel%20%3FroleWikipediaLink%20WHERE%20%7B%0A%20%20%3Frole%20wdt%3AP31%2a%7Cwdt%3AP279%2a%20wd%3AQ116%20.%0A%20%20%0A%20%20%3Frole%20wdt%3AP279%20%3Fclass%20.%0A%20%20%3Fclass%20rdfs%3Alabel%20%3FclassLabel%20.%0A%20%20%0A%20%20OPTIONAL%7B%3Frole%20skos%3AaltLabel%20%3FroleAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FroleAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20OPTIONAL%7B%3Fclass%20skos%3AaltLabel%20%3FclassAltLabel%0A%20%20%20%20%20%20%20%20%20%20FILTER%20%28LANG%28%3FclassAltLabel%29%3D%22en%22%29%20.%0A%20%20%20%20%20%20%20%20%20%20%7D%20%23position%20has%20an%20alias%0A%20%20%0A%20%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20%20FILTER%20%28STR%28%3FroleWikipediaLink%29%21%3D%22https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FPope%22%29%0A%20%20%0A%20%20%0A%20%20%3Frole%20rdfs%3Alabel%20%3FroleLabel%20.%0A%20%20filter%20langMatches%28lang%28%3FroleLabel%29%2C%22en%22%29%20%20%0A%20%20filter%20langMatches%28lang%28%3FclassLabel%29%2C%22en%22%29%20%20%0A%7D");
//		kingRequest.setDataFormat(DataForomat.JSON);
//		result = Caller.run(kingRequest);
//		JsonParser.parseResultToMap(result);
//		//JsonParser.printMapStatistic("roles/king");
//		JsonParser.aggegateAndPrintMapStatistic("roles/king");
//		//JsonParser.printAnchorTextData("rolesLinks/king");
//		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/king");
		
		final Request presidentRequest = new Request();
		presidentRequest.setQuery("SELECT%20DISTINCT%20%3FroleLabel%20%3FclassLabel%20%3FroleWikipediaLink%0AWHERE%20%0A%7B%0A%20%20%3Frole%20wdt%3AP31%20wd%3AQ5.%0A%20%20%3Frole%20wdt%3AP39%20%3Fclass%20.%0A%20%20%3Fclass%20wdt%3AP279%2B%20wd%3AQ30461%20.%0A%20%20%0A%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D");
		presidentRequest.setDataFormat(DataForomat.JSON);
		String result = Caller.run(presidentRequest);
		JsonParser.parseResultToMap(result);
		//JsonParser.printMapStatistic("roles/king");
		JsonParser.aggegateAndPrintMapStatistic("roles/president");
		//JsonParser.printAnchorTextData("rolesLinks/king");
		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/president");
		
		final Request monarchRequest = new Request();
		monarchRequest.setQuery("SELECT%20DISTINCT%20%3FroleLabel%20%3FclassLabel%20%3FroleWikipediaLink%0AWHERE%20%0A%7B%0A%20%20%3Frole%20wdt%3AP31%20wd%3AQ5.%0A%20%20%3Frole%20wdt%3AP39%20%3Fclass%20.%0A%20%20%3Fclass%20wdt%3AP279%2a%20wd%3AQ116%20.%0A%20%20%0A%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D");
		monarchRequest.setDataFormat(DataForomat.JSON);
		result = Caller.run(monarchRequest);
		JsonParser.parseResultToMap(result);
		//JsonParser.printMapStatistic("roles/king");
		JsonParser.aggegateAndPrintMapStatistic("roles/monarch");
		//JsonParser.printAnchorTextData("rolesLinks/king");
		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/monarch");
		
		final Request popeRequest = new Request();
		popeRequest.setQuery("SELECT%20DISTINCT%20%3FroleLabel%20%3FclassLabel%20%3FroleWikipediaLink%0AWHERE%20%0A%7B%0A%20%20%3Frole%20wdt%3AP31%20wd%3AQ5.%0A%20%20%3Frole%20wdt%3AP39%20%3Fclass%20.%0A%20%20%0A%20%20FILTER%20%28%3Fclass%3Dwd%3AQ19546%20%29.%0A%20%20%20%20%0A%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D");
		popeRequest.setDataFormat(DataForomat.JSON);
		result = Caller.run(popeRequest);
		JsonParser.parseResultToMap(result);
		//JsonParser.printMapStatistic("roles/king");
		JsonParser.aggegateAndPrintMapStatistic("roles/pope");
		//JsonParser.printAnchorTextData("rolesLinks/king");
		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/pope");
		
		final Request ceoRequest = new Request();
		ceoRequest.setQuery("SELECT%20DISTINCT%20%3FroleLabel%20%3FclassLabel%20%3FroleWikipediaLink%0AWHERE%20%0A%7B%0A%20%20%3Frole%20wdt%3AP31%20wd%3AQ5.%0A%20%20%3Frole%20wdt%3AP39%7Cwdt%3AP106%20%3Fclass%20.%0A%20%20FILTER%28%3Fclass%20%3D%20wd%3AQ484876%29%0A%20%20%0A%20%20%0A%20%20%0A%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D");
		ceoRequest.setDataFormat(DataForomat.JSON);
		result = Caller.run(ceoRequest);
		JsonParser.parseResultToMap(result);
		//JsonParser.printMapStatistic("roles/king");
		JsonParser.aggegateAndPrintMapStatistic("roles/ceo");
		//JsonParser.printAnchorTextData("rolesLinks/king");
		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/ceo");
		
		final Request chancellorRequest = new Request();
		chancellorRequest.setQuery("SELECT%20DISTINCT%20%3FroleLabel%20%3FclassLabel%20%3FroleWikipediaLink%0AWHERE%20%0A%7B%0A%20%20%3Frole%20wdt%3AP31%20wd%3AQ5.%0A%20%20%3Frole%20wdt%3AP39%20%3Fclass%20.%0A%20%20%3Fclass%20wdt%3AP279%2B%20wd%3AQ373085%20.%0A%20%20%0A%20%20%3FroleWikipediaLink%20schema%3Aabout%20%3Frole%20.%0A%20%20FILTER%20REGEX%28STR%28%3FroleWikipediaLink%29%2C%20%22en.wikipedia.org%2Fwiki%2F%22%29%20.%0A%20%20SERVICE%20wikibase%3Alabel%20%7B%20bd%3AserviceParam%20wikibase%3Alanguage%20%22%5BAUTO_LANGUAGE%5D%2Cen%22.%20%7D%0A%7D");
		chancellorRequest.setDataFormat(DataForomat.JSON);
		result = Caller.run(chancellorRequest);
		JsonParser.parseResultToMap(result);
		//JsonParser.printMapStatistic("roles/king");
		JsonParser.aggegateAndPrintMapStatistic("roles/chancellor");
		//JsonParser.printAnchorTextData("rolesLinks/king");
		JsonParser.aggegateAndPrintAnchorTextData("rolesLinks/chancellor");
	}

}
