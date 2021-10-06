@Test
    public void testSerialization() {
        YIntervalSeriesCollection c1 = new YIntervalSeriesCollection();
        YIntervalSeries s1 = new YIntervalSeries("Series");
        s1.add(1.0, 1.1, 1.2, 1.3);
        YIntervalSeriesCollection c2 = (YIntervalSeriesCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    