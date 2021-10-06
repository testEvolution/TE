@Test
    public void testShift() {
        Range r1 = new Range(10.0, 20.0);
        Range r2 = Range.shift(r1, 20.0);
        assertEquals(30.0, r2.getLowerBound(), 0.001);
        assertEquals(40.0, r2.getUpperBound(), 0.001);

        r1 = new Range(0.0, 100.0);
        r2 = Range.shift(r1, -50.0, true);
        assertEquals(-50.0, r2.getLowerBound(), 0.001);
        assertEquals(50.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, 20.0, true);
        assertEquals(10.0, r2.getLowerBound(), 0.001);
        assertEquals(40.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, -30.0, true);
        assertEquals(-40.0, r2.getLowerBound(), 0.001);
        assertEquals(-10.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, 20.0, false);
        assertEquals(0.0, r2.getLowerBound(), 0.001);
        assertEquals(40.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 20.0);
        r2 = Range.shift(r1, -30.0, false);
        assertEquals(-40.0, r2.getLowerBound(), 0.001);
        assertEquals(0.0, r2.getUpperBound(), 0.001);

        // Shifting with a delta of 0 does not change the range
        r2 = Range.shift(r1, 0.0);
        assertEquals(r1, r2);

        try {
            Range.shift(null, 0.1);
            fail("Null value is accepted");
        }
        catch (Exception e) {
        }
    }

    