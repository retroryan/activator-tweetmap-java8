package lambdaExercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class ExerciseOne {

    public static void main(String[] args) {
        //old school for loop
        List<Integer> oldList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (Integer n : oldList) {
            System.out.println(n);
        }

        //printing each value with lambdas
        List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        newList.forEach(n -> System.out.println(n));

        //now using the :: method reference operator
        newList.forEach(System.out::println);

        List<Book> bookShelf = Book.createBookShelf();

        //Exercise - print out all the books using the getDebugStr.  Use the :: method reference

        //Exercise - Fill in the filter method
        // print only the books with more than 300 pages using the filter method.  Use the predicate:
        //book.getPageCount() > 300

        //Exercise - create a method that returns the page count of all the books that match a given predicate.

        //Exercise - use Collections.sort( ... to sort the book shelf by page count and then printout the new list with foreach.
        //Use the lambda syntax of (Book b2, Book b2) -> ....
    }

    /**
     * @param list      - list of books
     * @param predicate - function that returns a boolean-value
     */
    public static void filterBooks(List<Book> list, Predicate<Book> predicate) {
        list.forEach(n -> {
            if (predicate.test(n)) {
                System.out.println(n.getDebugStr() + " ");
            }
        });
    }
}
