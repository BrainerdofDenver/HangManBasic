package hangmangamebasic;

import java.util.SortedSet;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Hangman implements HangmanManager{
//_____________Attributes
	private Set<String> candidateWords;
	private int remainingGuesses; //guesses remaining
	private int guessLimit;     //initial allowed guesses
	private SortedSet<Character> guessedLetters;   //Set of guessed Char
	private String patternSet;
	
//_____________Constructors
	public Hangman(final List<String> dictionary,
					final int length,
					final int wrongGuessLimit)throws IllegalArgumentException{
		ListIterator<String> it = dictionary.listIterator();
		checkLength(length,wrongGuessLimit);
		candidateWords = dictionaryFilter(it,length);
		guessLimit = wrongGuessLimit;
		
	}
//_____________API Specific Methods
	public int record(char guess){
		guessedLetters.add(guess);
		remainingGuesses--;
		//update patternSet if applicable
		checkLetterMatch(guess);
		return 1;// The API requires a return int, though the method description
				// mentions "state changes"
	}
	public SortedSet<Character> guesses(){
		return guessedLetters;//updated by record()
	}
	public int guessesLeft(){
		return remainingGuesses;//updated by record()
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
		while(word.hasNext()){
			String checkWord = word.next();
			if(checkWord.length() == lngth){
				wordSet.add(checkWord);
			}
		}
		return wordSet;									//REFACTOR
	}
	private String patternBuilder(){
		String returnPattern;
		return returnPattern;
	}
	private boolean checkLetterMatch(char guess){
		if (checkChosenWord(candidateWords)){
			String chk = candidateWords.get(0);
		}
	}
	private boolean checkChosenWord(Set<String> words){
		return (words.size() == 1)? true : false;
	}
	private void checkLength(int lim, int guessLim) throws IllegalArgumentException{
		if(lim < 1
				&& guessLim < lim
				&& lim > 20) throw new IllegalArgumentException("Invalid fields");
		else guessLimit = lim;
		//Arbitrary upper limit for this exception
	}
//_____________Nested Classes
	
}
