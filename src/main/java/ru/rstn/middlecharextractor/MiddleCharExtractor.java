package ru.rstn.middlecharextractor;

public class MiddleCharExtractor implements IMiddleCharExtractor {
    @Override
    public String getMiddleChar(String source) {
        if (source == null || source.trim().isEmpty()) {
            return "";
        }
        int begin;
        int end;
        if (source.length() % 2 == 0) {
            begin = source.length() / 2 - 1;
            end = begin + 2;
        } else {
            begin = source.length() / 2;
            end = begin + 1;
        }
        return source.substring(begin, end);
    }
}
