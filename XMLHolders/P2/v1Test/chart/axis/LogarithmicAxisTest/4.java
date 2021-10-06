private void checkLogPowRoundTrip(double value) {
        assertEquals(value, this.axis.adjustedLog10(
                this.axis.adjustedPow10(value)), EPSILON, "log(pow(x)) = x");
        assertEquals(value, this.axis.adjustedPow10(
                this.axis.adjustedLog10(value)), EPSILON, "pow(log(x)) = x");
    }

    