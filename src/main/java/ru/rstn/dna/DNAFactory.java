package ru.rstn.dna;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the
 * development and functioning of living organisms.
 * <br/><br/>
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 * <br/><br/>
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 * You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */
public class DNAFactory implements IDNAFactory {

    private static Map<String, String> COMPLEMENT;
    private static Set<Integer> nucleuses;
    static {
        COMPLEMENT = new HashMap<>();
        COMPLEMENT.put("A", "T");
        COMPLEMENT.put("T", "A");
        COMPLEMENT.put("C", "G");
        COMPLEMENT.put("G", "C");

        nucleuses = new HashSet<>();
        for (String s : COMPLEMENT.keySet()) {
            nucleuses.add((int) s.charAt(0));
        }
    }

    @Override
    public String makeComplement(String dna) {
        if(dna == null || dna.trim().isEmpty()) {
            throw new NullPointerException("dna is null or empty");
        }
        if(!isValidDna(dna)) {
            throw new IllegalArgumentException("dna is not valid");
        }
        StringBuilder result = new StringBuilder();
        String[] dnaSource = dna.trim().toUpperCase().split("");
        for (String nucleus : dnaSource) {
            result.append(COMPLEMENT.get(nucleus));
        }
        return result.toString();
    }

    private boolean isValidDna(String dna) {

        return dna.chars().allMatch(value -> nucleuses.contains(value));
    }
}
