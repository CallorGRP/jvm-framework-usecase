package com.example.springbootmsacalculator.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Multiplication {

    // 인수
    private final int factorA;
    private final int factorB;

    Multiplication() {
        this(0, 0);
    }

}
