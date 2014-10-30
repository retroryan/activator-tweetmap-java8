package lambdaExercises;

import java.util.Optional;

public class ExerciseAboutOptions {

    public static void main(String[] args) {
        (new ExerciseAboutOptions()).testOptional();
    }

    public void testOptional() {
        Optional<String> optStr= Optional.empty();

        //set the string to test using Optional.of
        //then call printEnhancedString only if the string is present using ifPresent
        //the lambda can be called using a this pointer ->  this::printEnhancedString
    }

    public  void printEnhancedString(String str) {
        System.out.println("### " + str + "###");
    }
}
