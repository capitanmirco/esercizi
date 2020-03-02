class String15{
	public static void main(String[] args) {
		String x = "ciao     come va #, tutto bene   okayy";
		String [] okay = x.trim().split(" ");
		x = "";
		for(int i=0; i<okay.length; i++){
			okay[i] = okay[i].replace(",","").replace("#","");
			if(!okay[i].equals("")){
				x+=okay[i]+",";
			}
		}
		x = x.substring(0, x.length()-1);
		System.out.println(x);

	}
}