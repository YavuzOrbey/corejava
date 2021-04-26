package homework.Calculator.GenericCalculator;
@FunctionalInterface
public interface GenericCalc<T, K> {
    T compute( T a, T b, K operator);
}
