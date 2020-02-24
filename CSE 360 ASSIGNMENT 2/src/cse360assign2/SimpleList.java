/* Author: Frank Cimino
 * Class ID: 150
 * Assignment 2 
 * Description: This file contains the implementation for the SimpleList Class
 */

package cse360assign2;

/**
 * This is the implementation of the SimpleList Class
 * 
 * 
 * 
 * @author Frank Cimino
 *
 */

public class SimpleList {
	private int[] list;
	private int count;
	
	/**
	 * This is the constructor for the simpleList class.
	 * <p>
	 * This method initializes the list to size of ten and count to zero
	 */
	public SimpleList(){
		list = new int[10];
		count = 0;
	}
	
	/**
	 * Adds the element a to the list
	 * 
	 * @param newNumber
	 */
	public void add(int newNumber) {
		//if the count is 10 start the moving at 9 to avoid overflow error
		int start = count;
		if(count == list.length) {
			increaseSizeby50p();
		}
		
		//moves all elements down one
		for(int iterator = start; iterator > 0; iterator--){ 
			list[iterator] = list[iterator-1];
		}
		// adds new element to the start
		list[0] = newNumber; 
		
		//increments count since we added an element 
		count++; 
		
	}
	
	/**
	 * Increases the size of the list by 50 percent
	 */
	private void increaseSizeby50p() {
		int[] temp = list;
		list = new int[(int)(temp.length * 1.5)];
		
		for(int listMover = 0; listMover < temp.length; listMover++)
			list[listMover] = temp[listMover];
	}

	/**
	 * removes the element from the list
	 * <p>
	 * @param numberToRemove
	 */
	public void remove(int numberToRemove) {
		int removeIndex = -1;
		
		boolean found = false;
		
		for(int oldIndexFinder = 0; oldIndexFinder < count; oldIndexFinder++) {
			if(list[oldIndexFinder] == numberToRemove) {
				removeIndex = oldIndexFinder;
				oldIndexFinder = count + 1;
				found = true;
			}
		}
		
		if(!found) {
			return;
		}
		
		int end = count - 1;
		
		for(int shiftDown = removeIndex; shiftDown < end; shiftDown++) {
			list[shiftDown] = list[shiftDown + 1];
		}
		count--;
		if(count < ((int)(list.length * .75)) ){
			decreaseSizeOfListByOne();
		}
	}
	
	

	/**
	 * Decreases the size of the list by 1
	 */
	private void decreaseSizeOfListByOne() {
		int[] temp = list;
		list = new int[temp.length - 1];
		
		for(int listMover = 0; listMover < count; listMover++)
			list[listMover] = temp[listMover];
	}

	/**
	 * returns the number of elements in the list
	 * @return count
	 */
	public int count() {
		return count;
	}  
	
	/**
	 * returns a string representation of the list
	 * @return 
	 */
	public String toString(){
		String toReturn = "";
		
		if(count > 0) {
			toReturn += list[0];
			for(int iterator = 1; iterator < count; iterator++) {
				toReturn += " " + list[iterator];
			}
		}
		
		return toReturn;
		
	}
	/**
	 * searches the list for a certain integer and returns the index
	 * returns -1 if not found
	 * @param s
	 * @return
	 */
	public int search(int s){
		int toReturn = -1;
		for(int searchIndex = 0; searchIndex < count; searchIndex++) {
			if(list[searchIndex] == s) {
				toReturn = searchIndex;
				searchIndex = count + 1;
			}
		}
		return toReturn;
	}
	
	// START OF THE SECOND VERSION OF THE LIST
	
	/**
	 * Adds an element to the end of the list
	 * @param toADD
	 */
	public void append(int toADD) {
		if(count == list.length) {
			increaseSizeby50p();
		}
		list[count] = toADD;
		count++;
	}
	
	/**
	 * Returns the first element of the list
	 * @return
	 */
	public int first() {
		if(count == 0) {
			return -1;
		}else {
			return list[0];
		}
	}
	
	/**
	 * Returns the first element of the list
	 * @return
	 */
	public int last() {
		if(count == 0) {
			return -1;
		}else {
			return list[count-1];
		}
	}
	
	/**
	 * returns the size of the list
	 * @return
	 */
	public int size(){
		return list.length;
	}
}
