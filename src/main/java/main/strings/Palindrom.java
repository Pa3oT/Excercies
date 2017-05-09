package main.strings;

import java.util.Stack;

public class Palindrom {

	public static void main(String[] args) {
		String s = "123abba3426jjgf";
		printPalindromes(s);
	}

	private static void printPalindromes(String s) {
		int n = s.length();
		char c;
		//Stack will hold all the characters in the String
		Stack<Character> charStack = new Stack<Character>();
		StringBuffer palindrome = null;
		for (int i = 0; i < n; i++) {
			c = s.charAt(i);
			if (charStack.isEmpty()) {
				charStack.add(c);
			} else {
				if (c == charStack.peek()) {
					/* if current char matches then there is a Palindrome
					 * Pop the stacktop so that previous char can be compared
					 * with the next char
					 * */
					charStack.pop();

					if (palindrome != null) {
						/*Insert at the beginning of Palindrome */
						palindrome.insert(0, c);
						/*Insert at the end of Palindrome */
						palindrome.append(c);

					} else {
						/*Create a Palindrome */
						palindrome = new StringBuffer();
						palindrome.append(c);
						palindrome.append(c);
					}
					/*
					 * Handle boundary conditions when last letter is part of
					 * palindrome and stack is not empty.
					 * */
					if (charStack.isEmpty() || i == n - 1) {
						System.out.println(palindrome);
						palindrome = null;
					}
				} else {
					if (palindrome != null) {
						System.out.println(palindrome);
						palindrome = null;
					}
					charStack.add(c);
				}
			}
		}
	}
}
