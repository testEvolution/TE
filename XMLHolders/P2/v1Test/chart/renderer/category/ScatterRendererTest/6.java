@Test
    public void testFindRangeBounds() {
        ScatterRenderer r = new ScatterRenderer();
        assertNull(r.findRangeBounds(null));

        // an empty dataset should return a null range
        DefaultMultiValueCategoryDataset dataset
                = new DefaultMultiValueCategoryDataset();
        assertNull(r.findRangeBounds(dataset));

        List<Double> values = Arrays.asList(new Double[] {1.0});
        dataset.add(values, "R1", "C1");
        assertEquals(new Range(1.0, 1.0), r.findRangeBounds(dataset));

        values = Arrays.asList(new Double[] {2.0, 2.2});
        dataset.add(values, "R1", "C2");
        assertEquals(new Range(1.0, 2.2), r.findRangeBounds(dataset));

        values = Arrays.asList(new Double[] {-3.0, -3.2});
        dataset.add(values, "R1", "C3");
        assertEquals(new Range(-3.2, 2.2), r.findRangeBounds(dataset));

        values = Arrays.asList(new Double[] {6.0});
        dataset.add(values, "R2", "C1");
        assertEquals(new Range(-3.2, 6.0), r.findRangeBounds(dataset));

        r.setSeriesVisible(1, Boolean.FALSE);
        assertEquals(new Range(-3.2, 2.2), r.findRangeBounds(dataset));
    }

}