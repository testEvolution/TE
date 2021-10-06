@Test
    public void testCalculateMedian3() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        values.add(6.0);
        values.add(5.0);
        values.add(4.0);
        double median = Statistics.calculateMedian(values);
        assertEquals(3.5, median, 0.0000001);
    }

    