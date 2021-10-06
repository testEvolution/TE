@Test
    public void testIterateToFindRangeBounds2_XYDataset() {
        List<String> visibleSeriesKeys = new ArrayList<>();
        Range xRange = new Range(0.0, 10.0);

        // empty dataset returns null
        XYSeriesCollection dataset = new XYSeriesCollection();
        Range r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertNull(r);

        // add an empty series
        XYSeries s1 = new XYSeries("A");
        dataset.addSeries(s1);
        visibleSeriesKeys.add("A");
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertNull(r);

        // check a null value
        s1.add(1.0, null);
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertNull(r);

        // check a NaN
        s1.add(2.0, Double.NaN);
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertNull(r);

        // check a regular value
        s1.add(3.0, 5.0);
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertEquals(new Range(5.0, 5.0), r);

        // check another regular value
        s1.add(4.0, 6.0);
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertEquals(new Range(5.0, 6.0), r);

        // add a second series
        XYSeries s2 = new XYSeries("B");
        dataset.addSeries(s2);
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertEquals(new Range(5.0, 6.0), r);
        visibleSeriesKeys.add("B");
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertEquals(new Range(5.0, 6.0), r);

        // add a value to the second series
        s2.add(5.0, 15.0);
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertEquals(new Range(5.0, 15.0), r);

        // add a value that isn't in the xRange
        s2.add(15.0, 150.0);
        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, xRange, false);
        assertEquals(new Range(5.0, 15.0), r);

        r = DatasetUtils.iterateToFindRangeBounds(dataset,
                visibleSeriesKeys, new Range(0.0, 20.0), false);
        assertEquals(new Range(5.0, 150.0), r);
    }

    