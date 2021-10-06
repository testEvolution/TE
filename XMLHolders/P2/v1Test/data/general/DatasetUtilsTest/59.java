@Test
    public void testBug2849731_2() {
        XYIntervalSeriesCollection d = new XYIntervalSeriesCollection();
        XYIntervalSeries s = new XYIntervalSeries("S1");
        s.add(1.0, Double.NaN, Double.NaN, Double.NaN, 1.5, Double.NaN);
        d.addSeries(s);
        Range r = DatasetUtils.iterateDomainBounds(d);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(1.0, r.getUpperBound(), EPSILON);

        s.add(1.0, 1.5, Double.NaN, Double.NaN, 1.5, Double.NaN);
        r = DatasetUtils.iterateDomainBounds(d);
        assertEquals(1.0, r.getLowerBound(), EPSILON);
        assertEquals(1.5, r.getUpperBound(), EPSILON);

        s.add(1.0, Double.NaN, 0.5, Double.NaN, 1.5, Double.NaN);
        r = DatasetUtils.iterateDomainBounds(d);
        assertEquals(0.5, r.getLowerBound(), EPSILON);
        assertEquals(1.5, r.getUpperBound(), EPSILON);
    }
    