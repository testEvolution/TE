@Test
    public void testCalculateMean_Array() {

        // try null array
        boolean pass = false;
        try {
            Statistics.calculateMean((Number[]) null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            Statistics.calculateMean((Number[]) null, false);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // try an array containing no items
        assertTrue(Double.isNaN(Statistics.calculateMean(new Number[0])));
        assertTrue(Double.isNaN(Statistics.calculateMean(new Number[0],
                false)));

        // try an array containing a single Number
        Number[] values = new Number[] {1.0};
        assertEquals(1.0, Statistics.calculateMean(values), EPSILON);
        assertEquals(1.0, Statistics.calculateMean(values, true), EPSILON);
        assertEquals(1.0, Statistics.calculateMean(values, false), EPSILON);

        // try an array containing a single Number and a null
        values = new Number[] {1.0, null};
        assertTrue(Double.isNaN(Statistics.calculateMean(values)));
        assertTrue(Double.isNaN(Statistics.calculateMean(values, true)));
        assertEquals(1.0, Statistics.calculateMean(values, false), EPSILON);

        // try an array containing a single Number and a NaN
        values = new Number[] {1.0, Double.NaN};
        assertTrue(Double.isNaN(Statistics.calculateMean(values)));
        assertTrue(Double.isNaN(Statistics.calculateMean(values, true)));
        assertEquals(1.0, Statistics.calculateMean(values, false), EPSILON);
    }

    