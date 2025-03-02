public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean isPalindrome(String word) {
		String cleaning = word.toLowerCase().replaceAll(" ", "");
		int left = 0;
		int right = cleaning.length() - 1;

		while (left < right) {
			if (cleaning.charAt(left) != cleaning.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static int getAge(String[] nameArr, int[] ageArr, String name) {
		for(int i = 0; i < nameArr.length; i++) {
			if (nameArr[i].equalsIgnoreCase(name)) {
				return ageArr[i];
			}
		}

		return -1;
	}

	public static int countWords(String string, char character) {
		char lowercharacter = Character.toLowerCase(character);
		String[] stringarray = string.split(" ");
		int count = 0;

		for (int i = 0; i < stringarray.length; i++) {
			String lowerword = stringarray[i].toLowerCase();
			if (lowerword.indexOf(lowercharacter) != -1) {
				count++;
			}
		}

		return count;
 	}
}
