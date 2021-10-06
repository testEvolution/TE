@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultHeatMapDataset d1 = new DefaultHeatMapDataset(2, 3, -1.0, 4.0,
                -2.0, 5.0);
        d1.setZValue(0, 0, 10.0);
        d1.setZValue(0, 1, Double.NEGATIVE_INFINITY);
        d1.setZValue(0, 2, Double.POSITIVE_INFINITY);
        d1.setZValue(1, 0, Double.NaN);
        DefaultHeatMapDataset d2 = (DefaultHeatMapDataset) d1.clone();
        assertTrue(d1 != d2);
        assertTrue(d1.getClass() == d2.getClass());
        assertTrue(d1.equals(d2));

        // simple check for independence
        d1.setZValue(0, 0, 11.0);
        assertFalse(d1.equals(d2));
        d2.setZValue(0, 0, 11.0);
        assertTrue(d1.equals(d2));
    }

    