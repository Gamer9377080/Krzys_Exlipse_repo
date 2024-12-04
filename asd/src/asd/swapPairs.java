package asd;

import java.util.ArrayList;

public class swapPairs {
	public void swapPairs(ArrayList<String> listy){
		for(int i=0; i<listy.size(); i+=2) {
			String temp = listy.get(i);
			listy.set(i, listy.get(i+1));
			listy.set(i+1, temp);
		}
	}
	public static void main(String[] args) {
		
	}
	
}
