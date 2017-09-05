/*Encrypts a message by:
    1. Normalize
    2. Obfuscate
    3. Caesar Shift
    4. Group
 */

import java.util.Scanner;
public class ProjectCrypto {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("message: ");
        String message = input.nextLine();
        System.out.println("shift: ");
        int shift = input.nextInt();
        System.out.println("group size: ");
        int size = input.nextInt();
        String encrypted = encryptString(message, shift, size);
        System.out.println("result: " + encrypted);

    }

    public static String encryptString(String text, int shift, int size){
        String normalized = normalizeText(text);
        String obified = obify(normalized);
        String shifted =caesarText(obified, shift);
        String grouped = groupify(shifted, size);

        return grouped;
    }

    public static String normalizeText(String a) {
        String b = a.replaceAll("[^a-zA-Z]", "").toUpperCase();
        return b;
    }

    public static String obify(String b){
        b = b.replace("O","OBO");
        b = b.replace("A","OBA");
        b = b.replace("E","OBE");
        b = b.replace("I","OBI");
        b = b.replace("U","OBU");
        return b;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }


    public static String caesarText(String text, int shift){
        String normal =new String(shiftAlphabet(0));
        String shifted = new String(shiftAlphabet(shift));

        for(int i=0; i<=text.length()-1;i++) {
            text = changeCharInPosition(i, shifted.charAt(normal.indexOf(text.charAt(i))), text);
        }
        return text;
    }

    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static String groupify(String text, int size){
        if (text.length()%size != 0){
            while(text.length()%size != 0){
                text = text + "x";
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=text.length()-1; i++) {
            if (i != 0 && i%size == 0) {
                sb.append(' ');
            }
        sb.append(text.charAt(i));
    }
        return sb.toString();
    }
}




