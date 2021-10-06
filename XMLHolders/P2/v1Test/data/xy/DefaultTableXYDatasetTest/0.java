@Test
    public void testEquals() {
        DefaultTableXYDataset d1 = new DefaultTableXYDataset();
        XYSeries s1 = new XYSeries("Series 1", true, false);
        s1.add(1.0, 1.1);
        s1.add(2.0, 2.2);
        d1.addSeries(s1);

        DefaultTableXYDataset d2 = new DefaultTableXYDataset();
        XYSeries s2 = new XYSeries("Series 1", true, false);
        s2.add(1.0, 1.1);
        s2.add(2.0, 2.2);
        d2.addSeries(s2);

        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        s1.add(3.0, 3.3);
        assertFalse(d1.equals(d2));

        s2.add(3.0, 3.3);
        assertTrue(d1.equals(d2));
    }

    