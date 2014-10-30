package lambdaExercises;

/**
 * Convert a book to a given type
 * @param <R>
 */
public interface ConvertBook<R> {

    R apply(Book book);
}
