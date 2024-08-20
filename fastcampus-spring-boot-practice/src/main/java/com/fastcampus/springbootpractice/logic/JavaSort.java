package com.fastcampus.springbootpractice.logic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//구현체를 통한 버블정렬
@Component
public class JavaSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<T>(list);

        Collections.sort(output);

        return output;
    }
}
