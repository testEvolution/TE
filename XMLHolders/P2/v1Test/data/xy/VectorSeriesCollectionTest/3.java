@Test
    public void testSerialization() {
        VectorSeries s1 = new VectorSeries("Series");
        s1.add(1.0, 1.1, 1.2, 1.3);
        VectorSeriesCollection c1 = new VectorSeriesCollection();
        c1.addSeries(s1);
        VectorSeriesCollection c2 = (VectorSeriesCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    