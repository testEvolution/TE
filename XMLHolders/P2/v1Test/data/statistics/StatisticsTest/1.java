@Test
    public void testCalculateMean_Collection() {

        // try a null collection
        boolean pass = false;
        try {
            Statistics.calculateMean((Collection) null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            Statistics.calculateMean((Collection) null, false);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // try an empty collection
        List<Double> values = new ArrayList<>();
        assertTrue(Double.isNaN(Statistics.calculateMean(values)));
        assertTrue(Double.isNaN(Statistics.calculateMean(values, true)));
        assertTrue(Double.isNaN(Statistics.calculateMean(values, false)));

        // try a collection with a single number
        values.add(9.0);
        assertEquals(9.0, Statistics.calculateMean(values), EPSILON);
        assertEquals(9.0, Statistics.calculateMean(values, true), EPSILON);
        assertEquals(9.0, Statistics.calculateMean(values, false), EPSILON);

        // try a collection with a single number plus a null
        values.add(null);
        assertTrue(Double.isNaN(Statistics.calculateMean(values)));
        assertTrue(Double.isNaN(Statistics.calculateMean(values, true)));
        assertEquals(9.0, Statistics.calculateMean(values, false), EPSILON);

        // try a collection with a single number plus a NaN
        values.clear();
        values.add(9.0);
        values.add(Double.NaN);
        assertTrue(Double.isNaN(Statistics.calculateMean(values)));
        assertTrue(Double.isNaN(Statistics.calculateMean(values, true)));
        assertEquals(9.0, Statistics.calculateMean(values, false), EPSILON);

        // try a collection with several numbers
        values = new ArrayList<>();
        values.add(9.0);
        values.add(3.0);
        values.add(2.0);
        values.add(2.0);
        double mean = Statistics.calculateMean(values);
        assertEquals(4.0, mean, EPSILON);

        // a Collection containing a NaN will return Double.NaN for the result
        values.add(Double.NaN);
        assertTrue(Double.isNaN(Statistics.calculateMean(values)));
    }

    