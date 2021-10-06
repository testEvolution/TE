private void checkSwitchedLogPowRoundTrip(double value) {
         assertEquals(value, this.axis.switchedLog10(
                 this.axis.switchedPow10(value)), EPSILON, "log(pow(x)) = x");
         assertEquals(value, this.axis.switchedPow10(
                 this.axis.switchedLog10(value)), EPSILON, "pow(log(x)) = x");
     }

     