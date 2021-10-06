@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultTableXYDataset d1 = new DefaultTableXYDataset();
        XYSeries s1 = new XYSeries("Series 1", true, false);
        s1.add(1.0, 1.1);
        s1.add(2.0, 2.2);
        d1.addSeries(s1);

        DefaultTableXYDataset d2 = (DefaultTableXYDataset) d1.clone();

        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        s1.add(3.0, 3.3);
        assertFalse(d1.equals(d2));
    }

    