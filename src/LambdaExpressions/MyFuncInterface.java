package LambdaExpressions;

@FunctionalInterface
public interface MyFuncInterface<T> {
    boolean test(T value);
}
