package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger settingsLogger;

    @BeforeAll
    public static void openSettingsFile() {
        settingsLogger = Logger.INSTANCE2;
        settingsLogger.log("loging");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = settingsLogger.getLastLog();

        //then
        assertEquals("loging", lastLog);
    }



}
