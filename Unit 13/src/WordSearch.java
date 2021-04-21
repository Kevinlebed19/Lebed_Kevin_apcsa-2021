//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class WordSearch {
	private String[][] m;

	public WordSearch(int size, String str) {
		m = new String[size][size];
		int j = 0;
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < size; k++) {
				m[i][k] = str.substring(j, j + 1);
				j++;
			}
		}
	}

	public boolean isFound(String word) {
		for (int i = 0; i < m.length; i++) {
			for (int k = 0; k < m.length; k++)
				if (checkRight(word, i, k) || checkLeft(word, i, k) || checkUp(word, i, k) || checkDown(word, i, k)
						|| checkDiagUpRight(word, i, k) || checkDiagUpLeft(word, i, k) || checkDiagDownRight(word, i, k)
						|| checkDiagDownLeft(word, i, k))
					return true;
		}
		return false;
	}

	public boolean checkRight(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (c < 8) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkRight(w.substring(1), r, c + 1);
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (c >= 0) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkLeft(w.substring(1), r, c - 1);
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (r >= 0) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkUp(w.substring(1), r - 1, c);
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (r < 8) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkDown(w.substring(1), r + 1, c);
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (r >= 0 && c < 8) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkDiagUpRight(w.substring(1), r - 1, c + 1);
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (r >= 0 && c >= 0) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkDiagUpLeft(w.substring(1), r - 1, c - 1);
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (r < 8 && c >= 0) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkDiagDownLeft(w.substring(1), r + 1, c - 1);
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c) {
		if (w.length() == 0)
			return true;
		if (r < 8 && c < 8) {
			if (m[r][c].equals(w.substring(0, 1)))
				return checkDiagDownRight(w.substring(1), r + 1, c + 1);
		}
		return false;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < m.length; i++) {
			for (int k = 0; k < m.length; k++) {
				str += m[i][k] + " ";
			}
			str += "\n";
		}
		return str;
	}
}