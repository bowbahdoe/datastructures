package dev.mccue.datastructures;

public sealed interface LinkedList<T> {
    record Empty<T>() 
        implements LinkedList<T> {}
    record NotEmpty(T first, LinkedList<T> rest) 
        implements LinkedList<T> {}
}
