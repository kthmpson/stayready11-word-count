package com.codedifferently.wordcounter;
import org.junit.Test;
import org.junit.Assert;
import java.util.HashMap;

public class WordCounterTest {
    @Test
    public void hashmapTest() {
        //Given
        WordCounter wc = new WordCounter();
        int expected = 1;
        //When
        wc.wordmap.put("Kaiyen",1);
        int actual = wc.wordmap.get("Kaiyen");
        //Then
        Assert.assertEquals(expected,actual);
    }

    }

