package array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (char i = 0; i < word.length; i--)
            if (post[post.length - 1 - i] != word[word.length - 1 - i]){
                result = false;
                break;
            }
        return result;
    }
}
