import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextDecoder {
    private Pattern patternName = Pattern.compile("[A-Z].*?\s");
    private Pattern patternWeight = Pattern.compile("[0-9].??[0-9]");
    private Pattern patternAge = Pattern.compile("\s[0-9]{1,2}\s");
    private String name, age, weight;

    public Profile decodeText(String text) {
        int start;
        int end;
        Matcher matcher = patternName.matcher(text);
        if(matcher.find()){
            start = matcher.start();
            end = matcher.end();
            name = text.substring(start,end);
        }

        matcher = patternWeight.matcher(text);
        if(matcher.find()){
            start = matcher.start();
            end = matcher.end();
            weight = text.substring(start,end);
        }

        matcher = patternAge.matcher(text);
        if(matcher.find()){
            start = matcher.start();
            end = matcher.end();
            age = text.substring(start,end);
        }

        Profile cat = new Profile(name, Double.parseDouble(weight), Integer.parseInt(age.trim()));

        return cat;



    }



}
