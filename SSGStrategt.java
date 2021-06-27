
import java.util.*;

/**
 * 
 */
public class SSGStrategt implements Strategy {
	ArrayList<String> vocabulary;
    /**
     * Default constructor
     */
    public SSGStrategt(ArrayList<String> vocabulary) {
    	this.vocabulary = vocabulary;
    }

    Random rand = new Random();
    /**
     * 
     */
    public void generateSentence() {
    	Collections.sort(vocabulary);
    	
    	int randNumOfWords = rand.nextInt(vocabulary.size());
    	
    	
    	String sentence = "";
    	for(int i = 0; i < randNumOfWords; i++) {
    		int randIndex = rand.nextInt(vocabulary.size());
    		sentence += vocabulary.get(randIndex) + " ";
    	}
    	sentence.trim();
        System.out.println("Sorted Sentence Generator:" + sentence);
    }

}