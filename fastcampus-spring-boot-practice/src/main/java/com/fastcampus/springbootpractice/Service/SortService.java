package com.fastcampus.springbootpractice.Service;

import com.fastcampus.springbootpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    // sort를 받아와야 하는데 JavaSort인지 BubbleSort인지 지정해주지 않으면 Failed to read candidate component class 이런 에러 발생함
    // Sort를 구현한 구현체기 때문에 Spring이 무엇을 넣을지 몰라서 에러를 띄워주는 것
    private final Sort<String> sort;

    //Sort를 구현한 어떤 구현체가 오더라도 그 속의 sort 메서드를 호출할 수 있게 된다.
    //의존성 주입!
    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}