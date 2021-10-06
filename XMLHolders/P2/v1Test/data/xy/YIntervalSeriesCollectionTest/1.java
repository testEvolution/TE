@Test
    public void testCloning() throws CloneNotSupportedException {
        YIntervalSeriesCollection c1 = new YIntervalSeriesCollection();
        YIntervalSeries s1 = new YIntervalSeries("Series");
        s1.add(1.0, 1.1, 1.2, 1.3);
        c1.addSeries(s1);
        YIntervalSeriesCollection c2 = (YIntervalSeriesCollection) c1.clone();
        assertTrue(c1 != c2);
        assertTrue(c1.getClass() == c2.getClass());
        assertTrue(c1.equals(c2));

        // check independence
        s1.setDescription("XYZ");
        assertFalse(c1.equals(c2));
    }

    