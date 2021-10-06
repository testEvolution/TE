@Test
    public void testCalculateMedian4() {
        List<Double> values = new ArrayList<>();
        values.add(7.0);
        values.add(2.0);
        values.add(3.0);
        values.add(5.0);
        values.add(4.0);
        values.add(6.0);
        values.add(1.0);
        double median = Statistics.calculateMedian(values);
        assertEquals(4.0, median, 0.0000001);
    }

    