package training.intermediateoperators;

import java.util.List;
import java.util.stream.Stream;

public interface StreamIntermediateOperators {

    Stream<String> wordsLongerThanFiveCharacters(List<String> words);

    Stream<String> firstThreeWordsLongerThanFiveCharacters(List<String> words);

    Stream<String> firstThreeDistinctWordsLongerThanFiveCharactersInReverseAlphabeticalOrder(List<String> words);

    Stream<Integer> lengthOfWords(List<String> words);

    Stream<Integer> staircase();
}
