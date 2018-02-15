package org.stackroute.exercisetwo.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.stackroute.exercisetwo.WordCounter;

public class WordCounterTest {
	
	WordCounter wordCounter;
	@Before
	public void setUp() {
		wordCounter = new WordCounter();
	}

	@After
	public void tearDown() {
		wordCounter = null;
	}

	@Test
	public void testFileIsEmpty() {
		String fileName = "/home/summer/workspace/Testfiles/File3.txt";
		assertNull("File is not empty",wordCounter.countWords(fileName));
	}
	
	@Test
	public void testCountWords() {
		String fileName = "/home/summer/workspace/Testfiles/File2.txt";
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		wordCount.put("twinkle", 2);
		wordCount.put("little", 1);
		wordCount.put("the", 2);
		wordCount.put("star", 1);
		wordCount.put("how", 1);
		wordCount.put("I", 1);
		wordCount.put("wonder", 1);
		wordCount.put("what", 1);
		wordCount.put("you", 1);
		wordCount.put("are", 1);
		assertEquals("Word count failed.", wordCount, 
				wordCounter.countWords(fileName));
	}
	
	@Test
	public void testCountWordsFailure() {
		String fileName = "/home/summer/workspace/Testfiles/File1.txt";
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		wordCount.put("twinkle", 2);
		wordCount.put("little", 1);
		wordCount.put("the", 2);
		wordCount.put("star", 1);
		wordCount.put("how", 1);
		wordCount.put("I", 1);
		wordCount.put("wonder", 1);
		wordCount.put("what", 1);
		wordCount.put("you", 1);
		wordCount.put("are", 1);
		assertNotEquals("Word count failed.", wordCount, 
				wordCounter.countWords(fileName));
	}

}