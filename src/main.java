import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		question q[] = new question[6];
		for(int i = 0 ;i<6;i++){
			q[i] = new question();
		}
		
		q[0].setWord("RABBIT");
		q[0].setProof("");
		
		q[1].setWord("TURTLE");
		q[1].setProof("");
		
		q[2].setWord("DONKEY");
		q[2].setProof("");
		
		q[3].setWord("Parrot");
		q[3].setProof("");
		
		q[4].setWord("BEAVER");
		q[4].setProof("");
		
		q[5].setWord("SPIDER");
		q[5].setProof("");
		
		
		
		chafern ch = new chafern(q);
		ch.setVisible(true);
	}

}
