package calculator;

public abstract class GenericCalculator<E>{
    abstract public E add       (E num_1, E num_2);
    abstract public E subtract  (E num_1, E num_2);
    abstract public E multiply  (E num_1, E num_2);
    abstract public E divide    (E num_1, E num_2);
}
