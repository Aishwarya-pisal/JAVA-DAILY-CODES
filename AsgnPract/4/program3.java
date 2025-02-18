class IfElse{

	public static void main(String[]args){
	
	char x='@';

	if( x=='a'||x=='e'||x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U' ){
	
		System.out.println("Vowel");
	
	}else if(x >='a' && x<='z' || x>='A' && x<='Z'){
	
		System.out.println("Consonant");
	} else {
	
		System.out.println("Invalid Input");
	}
	
	
	}


}
