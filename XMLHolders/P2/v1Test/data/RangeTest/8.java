@Test
    public void testScale() {
        Range r1 = new Range(0.0, 100.0);
        Range r2 = Range.scale(r1, 0.10);
        assertEquals(0.0, r2.getLowerBound(), 0.001);
        assertEquals(10.0, r2.getUpperBound(), 0.001);

        r1 = new Range(-10.0, 100.0);
        r2 = Range.scale(r1, 2.0);
        assertEquals(-20.0, r2.getLowerBound(), 0.001);
        assertEquals(200.0, r2.getUpperBound(), 0.001);

        // Scaling with a factor of 1 does not change the range
        r2 = Range.scale(r1, 1.0);
        assertEquals(r1, r2);

        try {
            Range.scale(null, 0.1);
            fail("Null value is accepted");
        }
        catch (Exception e) {
        }

        try {
            Range.scale(r1, -0.5);
            fail("Negative factor accepted");
        }
        catch (Exception e) {
        }
    }

    