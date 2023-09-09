public class FindTotalVowels {
    public static void main(String[] args) {
        //findVowelsIteratively();
        findTotalVowelsRecusively();
    }

    private static void findVowelsIteratively() {
        String s = "aevedvyas";
        int vowel = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            char aChar = chars[i];
            if (isVowel(aChar)) {
                vowel++;
            }
        }
        System.out.println(vowel);
    }

    private static boolean isVowel(char aChar) {
        return (aChar == 'a' || aChar == 'A' ||
                aChar == 'E' || aChar == 'e' ||
                aChar == 'i' || aChar == 'I' ||
                aChar == 'o' || aChar == 'O' ||
                aChar == 'u' || aChar == 'U');
    }
    private static void findTotalVowelsRecusively() {
        String s = "aevedvyas";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        int result = findVowels(chars, start, end);
        System.out.println(result);
    }
    private static int findVowels(char[] chars, int start, int end) {
        char ele = chars[start];
        int result = 0;
        if(isVowel(ele)) {
            result++;
        }
        if(start == end) {
            return result;
        }
        int remaining = findVowels(chars, start+1, end);
        result = result + remaining;
        return result;
    }
}
