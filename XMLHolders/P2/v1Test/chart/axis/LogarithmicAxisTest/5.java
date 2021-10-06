@Test
    public void testSwitchedLog10() {
        assertFalse(this.axis.getAllowNegativesFlag(), "Axis should not allow negative values");

        assertEquals(Math.log(0.5) / LogarithmicAxis.LOG10_VALUE,
                this.axis.switchedLog10(0.5), EPSILON);
        checkSwitchedLogPowRoundTrip(20);
        checkSwitchedLogPowRoundTrip(10);
        checkSwitchedLogPowRoundTrip(5);
        checkSwitchedLogPowRoundTrip(2);
        checkSwitchedLogPowRoundTrip(1);
        checkSwitchedLogPowRoundTrip(0.5);
        checkSwitchedLogPowRoundTrip(0.2);
        checkSwitchedLogPowRoundTrip(0.0001);
     }

     