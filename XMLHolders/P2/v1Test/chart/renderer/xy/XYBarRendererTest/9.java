@Test
    public void testFindRangeBounds2() {
        XYIntervalSeries s1 = new XYIntervalSeries("S1");
        s1.add(1.0, 0.5, 1.5, 10.0, 9.5, 10.5);
        s1.add(2.0, 1.9, 2.1, 20.0, 19.8, 20.3);
        XYIntervalSeries s2 = new XYIntervalSeries("S2");
        s2.add(3.0, 2.5, 3.5, 30.0, 29.5, 30.5);
        s2.add(4.0, 3.9, 4.1, 9.0, 9.0, 9.0);
        XYIntervalSeriesCollection dataset = new XYIntervalSeriesCollection();
        dataset.addSeries(s1);
        dataset.addSeries(s2);
        
        XYBarRenderer renderer = new XYBarRenderer();
        renderer.setUseYInterval(false);
        Range r = renderer.findRangeBounds(dataset);
        assertEquals(9.0, r.getLowerBound(), EPSILON);
        assertEquals(30.0, r.getUpperBound(), EPSILON);
        
        renderer.setSeriesVisible(1, Boolean.FALSE);
        r = renderer.findRangeBounds(dataset);
        assertEquals(10.0, r.getLowerBound(), EPSILON);
        assertEquals(20.0, r.getUpperBound(), EPSILON);
    }

    