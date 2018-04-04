package ru.rstn.dna;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class DnaFactoryTest {

    private IDNAFactory factory = new DNAFactory();

    @Test
    public void nullDnaComplement() {
        Assertions.assertThrows(NullPointerException.class, () -> factory.makeComplement(null));

        Assertions.assertThrows(NullPointerException.class, () -> factory.makeComplement("  "));
    }

    @Test
    public void notCorrectDnaComplement() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factory.makeComplement("TACGi42"));
    }

    @Test
    public void dnaComplement() {
        Assertions.assertEquals("TACG", factory.makeComplement("ATGC"));
    }
}
