@Test
    public void testEquals() {
       XYSeries s1 = new XYSeries("Series");
       s1.add(1.2, 3.4);
       XYSeriesCollection c1 = new XYSeriesCollection();
       c1.addSeries(s1);
       IntervalXYDelegate d1 = new IntervalXYDelegate(c1);

       XYSeries s2 = new XYSeries("Series");
       XYSeriesCollection c2 = new XYSeriesCollection();
       s2.add(1.2, 3.4);
       c2.addSeries(s2);
       IntervalXYDelegate d2 = new IntervalXYDelegate(c2);

       assertTrue(d1.equals(d2));
       assertTrue(d2.equals(d1));

       d1.setAutoWidth(false);
       assertFalse(d1.equals(d2));
       d2.setAutoWidth(false);
       assertTrue(d1.equals(d2));

       d1.setIntervalPositionFactor(0.123);
       assertFalse(d1.equals(d2));
       d2.setIntervalPositionFactor(0.123);
       assertTrue(d1.equals(d2));

       d1.setFixedIntervalWidth(1.23);
       assertFalse(d1.equals(d2));
       d2.setFixedIntervalWidth(1.23);
       assertTrue(d1.equals(d2));
    }

    