@Test
    public void testAdjustedLog10() {
        checkLogPowRoundTrip(20);
        checkLogPowRoundTrip(10);
        checkLogPowRoundTrip(5);
        checkLogPowRoundTrip(2);
        checkLogPowRoundTrip(1);
        checkLogPowRoundTrip(0.5);
        checkLogPowRoundTrip(0.2);
        checkLogPowRoundTrip(0.0001);
    }

    