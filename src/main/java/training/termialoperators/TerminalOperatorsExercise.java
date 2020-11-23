package training.termialoperators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperatorsExercise implements StreamTerminalOperators {

    @Override
    public void addToSet(Stream<String> stream, Set<String> set) {
        stream.collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    @Override
    public void addToListInReverseOrder(Stream<String> stream, List<String> list) {
        stream.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    @Override
    public String[] collectToArray(Stream<String> stream) {
        return stream.toArray(String[]::new);
    }

    @Override
    public Set<String> collectToSet(Stream<String> stream) {
        return Set.of(String.valueOf(stream.collect(Collectors.toSet())));
    }

    @Override
    public List<String> collectToList(Stream<String> stream) {
        return List.of(String.valueOf(stream.collect(Collectors.toList())));
    }

    @Override
    public String mergeIntoString(Stream<String> stream) {
        return stream.collect(Collectors.joining("-"));
    }

    @Override
    public int countCharacters(Stream<String> stream) {
        return (int) stream.collect(Collectors.joining("")).chars().count();
    }

    @Override
    public int longestWordLength(Stream<String> stream) {
        return stream.map(String::length).max(Integer::compare).get();
    }

    @Override
    public String longestWord(Stream<String> stream) {
        return String.valueOf(stream.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2));
    }

    @Override
    public Map<Integer, List<String>> wordsGroupedByLength(Stream<String> stream) {
        return Map.of();
    }
}
