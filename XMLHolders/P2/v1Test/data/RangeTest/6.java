@Test
    public void testExpand() {
        Range r1 = new Range(0.0, 100.0);
        Range r2 = Range.expand(r1, 0.10, 0.10);
        assertEquals(-10.0, r2.getLowerBound(), 0.001);
        assertEquals(110.0, r2.getUpperBound(), 0.001);

        // Expand by 0% does not change the range
        r2 = Range.expand(r1, 0.0, 0.0);
        assertEquals(r1, r2);

        try {
            Range.expand(null, 0.1, 0.1);
            fail("Null value is accepted");
        }
        catch (Exception e) {
        }

        // Lower > upper: mid point is used
        r2 = Range.expand(r1, -0.8, -0.5);
        assertEquals(65.0, r2.getLowerBound(), 0.001);
        assertEquals(65.0, r2.getUpperBound(), 0.001);
    }

    