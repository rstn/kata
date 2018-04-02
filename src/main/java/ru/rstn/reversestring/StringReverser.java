package ru.rstn.reversestring;

public class StringReverser implements IStringReverser {
    @Override
    public String reverse(String source) {
        if(source == null || source.trim().isEmpty()) {
            return source;
        }
        source = source.trim();

        char[] chars = source.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chars.length -1; i >=0 ; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }
}
