package belajarspring.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseSingletonTest {
    @Test
    void testSingleton() {
        var database1 = DatabaseSingleton.getInstance();
        var database2 = DatabaseSingleton.getInstance();


        Assertions.assertSame(database1, database2);
    }
}
