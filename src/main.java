import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		question q[] = new question[7];
		for(int i = 0 ;i<7;i++){
			q[i] = new question();
		}
		
		q[0].setWord("RABBIT");
		q[0].setProof("The animal that has long ears.\nThe animal that is a carrot lover.");
		
		q[1].setWord("TURTLE");
		q[1].setProof("The animal that is an amphibian,and it can shrink its head and body.\nThe animal that has a long life.");
		
		q[2].setWord("DONKEY");
		q[2].setProof("The animal that looks like a horse.");
		
		q[3].setWord("PARROT");
		q[3].setProof("The animal that can fly and is very familiar with people.\nThe animal that has a colorful body and can imitate human voice.");
		
		q[4].setWord("BEAVER");
		q[4].setProof("The animal that is an herbivore and lives around northern hemisphere.\nThe animal that is represented as the diligence \n,or the hard working person");
		
		q[5].setWord("SPIDER");
		q[5].setProof("The animal that is arthropods that have eight legs.\nThe animal that can build their own shelter or called “Web”");
		
		q[6].setWord("XXXXXX");
		q[6].setProof("Press Any Key to Continue");
		
		int no = 0;
		
		chafern ch = new chafern(q,no);
		ch.setVisible(true);
	}

}
