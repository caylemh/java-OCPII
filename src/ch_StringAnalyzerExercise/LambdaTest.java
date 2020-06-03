package ch_StringAnalyzerExercise;

public class LambdaTest {
    public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer){
        for(String currentStr:strList){
            if (analyzer.analyze(currentStr, searchStr)){
                System.out.println("Match: " + currentStr);
            }
        }
    }

    public static void main(String[] args) {
        String[] strList01 =
                {"tomorrow","toto","to","timbukto","the","hello","heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

        // Using a Lambda Expression
        System.out.println("===Contains===");
        StringAnalyzer contains = (t,s) -> t.contains(s); // Assigning Lambda Expression to a variable
        searchArr(strList01, searchStr, contains);
    }
}
