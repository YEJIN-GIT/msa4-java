package com.msa4java.edu.generics;

import java.util.ArrayList;
import java.util.List;

public class Box3<T, S> {
    public List<T> item = new ArrayList<>(10);  // new ArrayList<T>(10); 와 같다.

    public S test(S s) {
        return s;
    }
}
