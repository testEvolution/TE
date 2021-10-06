@Test
    public void testCalculateMedian1() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        double median = Statistics.calculateMedian(values);
        assertEquals(1.0, median, 0.0000001);
    }

    