@Test
    public void testConstructor() {
        Range r1 = new Range(0.1, 1000.0);
        assertEquals(r1.getLowerBound(), 0.1, 0.0d);
        assertEquals(r1.getUpperBound(), 1000.0, 0.0d);

        try {
            /*Range r2 =*/ new Range(10.0, 0.0);
            fail("Lower bound cannot be greater than the upper");
        }
        catch (Exception e) {
            // expected
        }
    }

    