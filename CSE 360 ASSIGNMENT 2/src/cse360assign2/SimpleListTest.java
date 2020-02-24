/* Author: Frank Cimino
 * Class ID: 150
 * Assignment 1
 * Description: This file contains the Junit Tests for the SimpleList Class
 */

package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This is the Junit test class for simpleList java
 * @author Frank Cimino
 *
 */
public class SimpleListTest {

	/**
	 * tests the constructor of SimpleList
	 */
	@Test
	public void testSimpleList() {
		SimpleList s = new SimpleList();
		assertEquals("Pass: Count was  set to 0 after init", s.count(), 0);
	}
	
	/**
	 * tests adding one element to SimpleList
	 */
	@Test
	public void testAdd() {
		SimpleList s = new SimpleList();
		s.add(9);
		assertEquals("Pass: count went up", s.count(), 1);
	}
	
	/**
	 * tests adding 10 elements to the SimpleList
	 */
	@Test
	public void testAddMax() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		assertEquals("Pass: count went up", s.count(), 10);
	}
	
	/**
	 * tests adding 11 elements to simpleList
	 */
	@Test
	public void testAddOverMax() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.add(11);
		assertEquals("Pass: count went up", s.count(), 10);
	}
	
	/**
	 * tests the remove a element
	 */
	@Test
	public void testRemove() {
		SimpleList s = new SimpleList();
		s.add(9);
		s.add(6);
		s.remove(6);
		assertEquals("Pass: count went down", s.count(), 1);
	}
	
	/**
	 * tests the remove a element on a filled SimpleList from the middle
	 */
	@Test
	public void testRemoveMaxMid() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.remove(5);
		assertEquals("Pass: count went down", s.count(), 9);
	}
	
	/**
	 * tests the remove a element on a filled SimpleList from the end
	 */
	@Test
	public void testRemoveMaxEnd() {
		SimpleList s = new SimpleList();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		s.add(10);
		s.remove(10);
		assertEquals("Pass: count went down", s.count(), 9);
	}
	
	/**
	 * tests if SimpleList returns the correct count
	 */
	@Test
	public void testCount() {
		SimpleList s = new SimpleList();
		s.add(9);
		assertEquals("Pass: count is correct", s.count(), 1);
	}
	
	/**
	 * tests the SimpleList tostring method
	 */
	@Test
	public void testToString() {
		SimpleList s = new SimpleList();
		s.add(9);
		s.add(10);
		s.add(11);
		s.add(12);
		assertEquals("Pass: string is correct", s.toString(), "12 11 10 9");
	}
	
	/**
	 * tests the SimpleList tostring method
	 */
	@Test
	public void testToStringRemoveMid() {
		SimpleList s = new SimpleList();
		s.add(9);
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.remove(11);
		assertEquals("Pass: string is correct", s.toString(), "13 12 10 9");
	}
	/**
	 * tests the SimpleList search method
	 */
	@Test
	public void testSearch() {
		SimpleList s = new SimpleList();
		s.add(9);
		s.add(10);
		s.add(11);
		assertEquals("Pass: returned correct index", s.search(10), 1);
	}
	
	/**
	 * tests the SimpleList tostring method
	 */
	@Test
	public void testToRemoveAfterDups() {
		SimpleList s = new SimpleList();
		s.add(9);
		s.add(10);
		s.add(11);
		s.add(14);
		s.add(11);
		s.add(12);
		s.add(13);
		s.remove(11);
		assertEquals("Pass: string is correct", s.toString(), "13 12 14 11 10 9");
	}

}
