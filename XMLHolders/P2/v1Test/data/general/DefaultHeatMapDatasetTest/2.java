@Test
    public void testEquals() {
        DefaultHeatMapDataset d1 = new DefaultHeatMapDataset(5, 10, 1.0, 2.0,
                3.0, 4.0);
        DefaultHeatMapDataset d2 = new DefaultHeatMapDataset(5, 10, 1.0, 2.0,
                3.0, 4.0);
        assertEquals(d1, d2);

        d1 = new DefaultHeatMapDataset(6, 10, 1.0, 2.0, 3.0, 4.0);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHeatMapDataset(6, 10, 1.0, 2.0, 3.0, 4.0);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHeatMapDataset(6, 11, 1.0, 2.0, 3.0, 4.0);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHeatMapDataset(6, 11, 1.0, 2.0, 3.0, 4.0);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHeatMapDataset(6, 11, 2.0, 2.0, 3.0, 4.0);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHeatMapDataset(6, 11, 2.0, 2.0, 3.0, 4.0);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 3.0, 4.0);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 3.0, 4.0);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 4.0);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 4.0);
        assertTrue(d1.equals(d2));

        d1 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 5.0);
        assertFalse(d1.equals(d2));
        d2 = new DefaultHeatMapDataset(6, 11, 2.0, 3.0, 4.0, 5.0);
        assertTrue(d1.equals(d2));

        d1.setZValue(1, 2, 3.0);
        assertFalse(d1.equals(d2));
        d2.setZValue(1, 2, 3.0);
        assertTrue(d1.equals(d2));

        d1.setZValue(0, 0, Double.NEGATIVE_INFINITY);
        assertFalse(d1.equals(d2));
        d2.setZValue(0, 0, Double.NEGATIVE_INFINITY);
        assertTrue(d1.equals(d2));

        d1.setZValue(0, 1, Double.POSITIVE_INFINITY);
        assertFalse(d1.equals(d2));
        d2.setZValue(0, 1, Double.POSITIVE_INFINITY);
        assertTrue(d1.equals(d2));

        d1.setZValue(0, 2, Double.NaN);
        assertFalse(d1.equals(d2));
        d2.setZValue(0, 2, Double.NaN);
        assertTrue(d1.equals(d2));
    }

    