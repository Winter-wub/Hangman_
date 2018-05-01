
public class question {
	
	private char[] word;
	private String proof;
	private String word_str;
	public question(){
		word = new char[6];
	}
	
	public void setWord(String word){
		this.word_str = word;
		for(int i=0;i<6;i++){
			this.word[i] = word.charAt(i);
		}
	}
	
	public char getWordat(int i){
		return this.word[i];
	}
	
	public void setProof(String p){
		this.proof = p;
	}
	
	public String getWord_str(){
		return this.word_str;
	}
	
	public char[] getWord(){
		return this.word;
	}
	
	public String getProof(){
		return this.proof;
	}
}
