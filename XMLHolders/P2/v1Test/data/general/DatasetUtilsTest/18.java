@Test
    public void testIterateRangeBounds3() {
        // an empty dataset should return a null range
        XYSeriesCollection dataset = new XYSeriesCollection();
        Range r = DatasetUtils.iterateRangeBounds(dataset);
        assertNull(r);
        XYSeries s1 = new XYSeries("S1");
        dataset.addSeries(s1);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertNull(r);

        // a dataset with a single value
        s1.add(1.0, 1.23);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.23, r.getLowerBound(), EPSILON);
        assertEquals(1.23, r.getUpperBound(), EPSILON);

        // null is ignored
        s1.add(2.0, null);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.23, r.getLowerBound(), EPSILON);
        assertEquals(1.23, r.getUpperBound(), EPSILON);

        // Double.NaN DOESN'T mess things up
        s1.add(3.0, Double.NaN);
        r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.23, r.getLowerBound(), EPSILON);
        assertEquals(1.23, r.getUpperBound(), EPSILON);
    }

    