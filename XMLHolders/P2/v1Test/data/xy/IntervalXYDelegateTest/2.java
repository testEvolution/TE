@Test
    public void testSerialization() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.2, 3.4);
        XYSeriesCollection c1 = new XYSeriesCollection();
        c1.addSeries(s1);
        IntervalXYDelegate d1 = new IntervalXYDelegate(c1);
        IntervalXYDelegate d2 = (IntervalXYDelegate) TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

}