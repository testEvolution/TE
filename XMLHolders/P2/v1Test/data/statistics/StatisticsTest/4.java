@Test
    public void testCalculateMedian2() {
        List<Double> values = new ArrayList<>();
        values.add(2.0);
        values.add(1.0);
        double median = Statistics.calculateMedian(values);
        assertEquals(1.5, median, 0.0000001);
    }

    