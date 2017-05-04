package hangmangamebasic;

import java.util.SortedSet;
import java.util.List;
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
		//logic to filter dictionary into Set of candidate words based on
		//length.
		
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
	private Set<String> dictionaryFilter(List<String> wordList){
		
		return null;
	}
	private String patternBuilder(){
		String returnPattern;
		return returnPattern;
	}
	
}
