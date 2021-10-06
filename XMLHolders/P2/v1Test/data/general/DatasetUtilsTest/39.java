@Test
    public void testIsEmptyOrNullXYDataset() {
        XYSeriesCollection dataset = null;
        assertTrue(DatasetUtils.isEmptyOrNull(dataset));
        dataset = new XYSeriesCollection();
        assertTrue(DatasetUtils.isEmptyOrNull(dataset));
        XYSeries s1 = new XYSeries("S1");
        dataset.addSeries(s1);
        assertTrue(DatasetUtils.isEmptyOrNull(dataset));
        s1.add(1.0, 2.0);
        assertFalse(DatasetUtils.isEmptyOrNull(dataset));
        s1.clear();
        assertTrue(DatasetUtils.isEmptyOrNull(dataset));
    }

    