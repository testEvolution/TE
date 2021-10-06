@Test
    public void testSerialization() {
        DefaultTableXYDataset d1 = new DefaultTableXYDataset();
        XYSeries s1 = new XYSeries("Series 1", true, false);
        s1.add(1.0, 1.1);
        s1.add(2.0, 2.2);
        d1.addSeries(s1);

        DefaultTableXYDataset d2 = (DefaultTableXYDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    