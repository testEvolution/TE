@Test
    public void testBug3445507() {
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, null);
        s1.add(2.0, null);

        XYSeries s2 = new XYSeries("S2");
        s1.add(1.0, 5.0);
        s1.add(2.0, 6.0);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s1);
        dataset.addSeries(s2);

        Range r = dataset.getRangeBounds(false);
        assertEquals(5.0, r.getLowerBound(), EPSILON);
        assertEquals(6.0, r.getUpperBound(), EPSILON);
    }
 
    