@Test
    public void testCalculateBoxAndWhiskerStatistics() {

        // try null list
        boolean pass = false;
        try {
            BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // try a list containing a single value
        List<Double> values = new ArrayList<>();
        values.add(1.1);
        BoxAndWhiskerItem item
            = BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(values);
        assertEquals(1.1, item.getMean().doubleValue(), EPSILON);
        assertEquals(1.1, item.getMedian().doubleValue(), EPSILON);
        assertEquals(1.1, item.getQ1().doubleValue(), EPSILON);
        assertEquals(1.1, item.getQ3().doubleValue(), EPSILON);
    }

    