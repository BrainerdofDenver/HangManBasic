package hangmangamebasic;

import java.util.SortedSet;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Hangman implements HangmanManager{
//_____________Attributes
	private Set<String> candidateWords; //words of given length
	private int remainingGuesses; //guesses remaining
	private int guessLimit;     //initial allowed guesses
	private SortedSet<Character> guessedLetters;   //Set of guessed Char
	private String patternSet;
	
//_____________Constructors
	public Hangman(final List<String> dictionary,
					final int length,
					final int wrongGuessLimit){
		ListIterator<String> it = dictionary.listIterator();
		candidateWords = dictionaryFilter(it,length);
		guessLimit = wrongGuessLimit;
		
	}
//_____________API Specific Methods
	public int record(char guess){
		return 1;
	}
	public SortedSet<Character> guesses(){
		return guessedLetters;
	}
	public int guessesLeft(){
		return remainingGuesses;
	}
	public String pattern(){
		return patternSet;
	}
	public Set<String> words(){
		return candidateWords;
	}
	public int wrongGuessLimit(){
		return guessLimit;
	}
//_____________Private Methods
	private Set<String> dictionaryFilter(ListIterator<String> word, int lngth){
		Set<String> wordSet = new HashSet<String>();
		
		return wordSet;
	}
	private String patternBuilder(){
		String returnPattern;
		return returnPattern;
	}
	
}
