@Test
    public void testSerialization() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 1.1);
        XYSeriesCollection c1 = new XYSeriesCollection();
        c1.addSeries(s1);
        XYSeriesCollection c2 = (XYSeriesCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    