package ch6_StringAnalyzerExercise;

public class InterfaceTest {
    public static void main(String[] args) {
        String[] strList =
                {"tomorrow","toto","to","timbukto","the","hello","heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

        // Call concrete class that implements StringAnalyzer
        ContainsAnalyzer contains = new ContainsAnalyzer();

        System.out.println("===Contains===");
        for(String currentStr:strList){
            if (contains.analyze(currentStr, searchStr)){
                System.out.println("Match: " + currentStr);
            }
        }
    }
}
