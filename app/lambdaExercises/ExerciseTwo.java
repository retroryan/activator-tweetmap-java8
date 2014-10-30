package lambdaExercises;

import java.util.Arrays;
import java.util.List;

public class ExerciseTwo {

    public static void main(String[] args) {


        List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Exercise -> print out only even integers, by using stream filter
        // newList.stream().filter( ...

        //Exercise -> In filter first times each element by 3 and then return only even integers.
        // newList.stream().filter(n -> {  .....   });

        List<Book> bookShelf = Book.createBookShelf();
        // Exercise -> Make a new list of books filtered by hard back and then print them out

//        List<Book> hardBackBooks = bookShelf
//                .stream()
//                .filter()
//                .collect(Collectors.toList());

        //Exercise -> count all the pages of all the books on the book shelf
//        long totalPages = bookShelf
//                .stream()
//                .filter()
//                .mapToInt()
//                .sum();

        //Exercise -> call the eval book passing in a lambda that returns the title and author concatenated together
    }

    public static List<String> evalBook(List<Book> bookShelf, ConvertBook<String> bookToString) {
        //call the function on each element passed in to create a new String list
        // bookShelf.stream()
        //          .map(bookToString)
        //          .collect(Collectors.toList());
        return null;
    }

}
