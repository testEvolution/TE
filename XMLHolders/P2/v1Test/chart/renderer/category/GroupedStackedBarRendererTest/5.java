@Test
    public void testFindRangeBounds() {
        GroupedStackedBarRenderer r = new GroupedStackedBarRenderer();
        assertNull(r.findRangeBounds(null));

        // an empty dataset should return a null range
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        assertNull(r.findRangeBounds(dataset));

        dataset.addValue(1.0, "R1", "C1");
        assertEquals(new Range(0.0, 1.0), r.findRangeBounds(dataset));

        dataset.addValue(-2.0, "R1", "C2");
        assertEquals(new Range(-2.0, 1.0), r.findRangeBounds(dataset));

        dataset.addValue(null, "R1", "C3");
        assertEquals(new Range(-2.0, 1.0), r.findRangeBounds(dataset));

        KeyToGroupMap m = new KeyToGroupMap("G1");
        m.mapKeyToGroup("R1", "G1");
        m.mapKeyToGroup("R2", "G1");
        m.mapKeyToGroup("R3", "G2");
        r.setSeriesToGroupMap(m);

        dataset.addValue(0.5, "R3", "C1");
        assertEquals(new Range(-2.0, 1.0), r.findRangeBounds(dataset));

        dataset.addValue(5.0, "R3", "C2");
        assertEquals(new Range(-2.0, 5.0), r.findRangeBounds(dataset));
    }

}