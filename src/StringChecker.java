
public class StringChecker {

    public static void main(String[] args) {

        verifiedString("AbaCAxi", 'A');

    }

    public static void verifiedString(String word, Character targetLetter) {
        var wordSize = word.length();
        var count = 0;

        var transformedWordToLowerCase = word.toLowerCase();

        var transformedTargetLetterToLowerCase= Character.toLowerCase(targetLetter);
        for(int i =0; i < wordSize; i++) {
            var cut = transformedWordToLowerCase.charAt(i);
            if (cut == transformedTargetLetterToLowerCase) {
                count++;
            }
        }
        System.out.print("Letra " +"'" + targetLetter + "'" + " aparece " + count + " vezes na palavra " + word);
    }
}   
