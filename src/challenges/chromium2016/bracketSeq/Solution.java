package challenges.chromium2016.bracketSeq;

/*

A bracket sequence is considered to be a valid bracket expression if any of the following conditions is true:
	it is empty;
	it has the form "(U)" where U is a valid bracket sequence;
	it has the form "VW" where V and W are valid bracket sequences.

 */

public class Solution {
	public int solution(String S, int K) {
		if (S.length()==0)
			return 0;
		return -1;
	}

	int longestSeq(String s) {
		int counter = 0;
		int max = 0;

		return max;
	}

	boolean isBracketSeq(String s) {
		int counter = 0;
		char[] chars = s.toCharArray();
		for (char c : chars) {
			switch (c) {
				case '(':
					counter++;
					break;
				case ')':
					counter--;
					break;
			}
			if (counter < 0)
				return false;
		}
		return counter == 0;
	}
}
