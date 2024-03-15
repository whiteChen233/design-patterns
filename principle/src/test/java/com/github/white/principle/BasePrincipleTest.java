package com.github.white.principle;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;

public interface BasePrincipleTest {

   default void execute(Executable executable) {
        Assertions.assertDoesNotThrow(executable);
    }
}
