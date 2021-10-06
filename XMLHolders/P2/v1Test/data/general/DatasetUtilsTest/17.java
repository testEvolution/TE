@Test
    public void testIterateRangeBounds2() {
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 1.1);
        s1.add(2.0, null);
        s1.add(3.0, 3.3);
        XYSeriesCollection dataset = new XYSeriesCollection(s1);
        Range r = DatasetUtils.iterateRangeBounds(dataset);
        assertEquals(1.1, r.getLowerBound(), EPSILON);
        assertEquals(3.3, r.getUpperBound(), EPSILON);
    }

    