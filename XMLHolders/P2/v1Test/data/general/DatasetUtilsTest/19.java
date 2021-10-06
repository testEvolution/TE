@Test
    public void testIterateRangeBounds4() {
        YIntervalSeriesCollection dataset = new YIntervalSeriesCollection();
        Range r = DatasetUtils.iterateRangeBounds(dataset);
        assertNull(r);
        YIntervalSeries s1 = new YIntervalSeries("S1");
        dataset.addSeries(s1);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertNull(r);

        // try a single item
        s1.add(1.0, 2.0, 1.5, 2.5);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.5, r.getLowerBound(), EPSILON);
        assertEquals(2.5, r.getUpperBound(), EPSILON);

        // another item
        s1.add(2.0, 2.0, 1.4, 2.1);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.4, r.getLowerBound(), EPSILON);
        assertEquals(2.5, r.getUpperBound(), EPSILON);

        // another empty series
        YIntervalSeries s2 = new YIntervalSeries("S2");
        dataset.addSeries(s2);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.4, r.getLowerBound(), EPSILON);
        assertEquals(2.5, r.getUpperBound(), EPSILON);

        // an item in series 2
        s2.add(1.0, 2.0, 1.9, 2.6);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.4, r.getLowerBound(), EPSILON);
        assertEquals(2.6, r.getUpperBound(), EPSILON);
    }

    