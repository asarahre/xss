public static void main(String[] args) {
	        String input = "<script type=\"text/javascript\">alert('Itamar')</script>";
	        String input2 = "<a href='https://regex101.com/r/UEo8Yx/2'</a>";
	        List<String> casos = new ArrayList<String>();
	        casos.add("<");
	        casos.add("</");
	        casos.add(">");
	        casos.add("href=");
	        casos.add("src=");
	        casos.add("htmlentites(");
	        casos.add("type=");
	        casos.add("nonce=");
	        casos.add("class=");
	        casos.add(".innerHTML");
	        casos.add(".document");
	        casos.add(".on");
	        casos.add("///");
	        
	        if(input.contains("<") && input.contains("</") && input.contains(">")) {
	        	input = "";
	        }else {
	        	for(String caso : casos) {
	        		if(input.contains(caso)) {
	        			input = "";
	        			break;
	        		}
	        	}
	        }
	        
	        System.out.println(input);
	 }
