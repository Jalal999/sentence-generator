
import java.util.*;
import java.util.Random; 

/**
 * 
 */
public class RSGStrategy implements Strategy {

    /**
     * Default constructor
     */
	ArrayList<String> vocabulary;
    public RSGStrategy(ArrayList<String> vocabulary) {
    	this.vocabulary = vocabulary;
    }

    Random rand = new Random();
     
    /**
     * 
     */
    public void generateSentence() {
    	
    	int randNumOfWords = rand.nextInt(vocabulary.size());
    	
    	
    	String sentence = "";
    	for(int i = 0; i < randNumOfWords; i++) {
    		int randIndex = rand.nextInt(vocabulary.size());
    		sentence += vocabulary.get(randIndex) + " ";
    	}
    	sentence.trim();
        System.out.println("Random Sentence Generator:" + sentence);
    }

  

}