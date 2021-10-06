@Test
    public void testGetRangeBounds() {
        DefaultStatisticalCategoryDataset d
                = new DefaultStatisticalCategoryDataset();

        // an empty dataset should return null for bounds
        assertNull(d.getRangeBounds(true));

        // try a dataset with a single value
        d.add(4.5, 1.0, "R1", "C1");
        assertEquals(new Range(4.5, 4.5), d.getRangeBounds(false));
        assertEquals(new Range(3.5, 5.5), d.getRangeBounds(true));

        // try a dataset with two values
        d.add(0.5, 2.0, "R1", "C2");
        assertEquals(new Range(0.5, 4.5), d.getRangeBounds(false));
        assertEquals(new Range(-1.5, 5.5), d.getRangeBounds(true));

        // try a Double.NaN
        d.add(Double.NaN, 0.0, "R1", "C3");
        assertEquals(new Range(0.5, 4.5), d.getRangeBounds(false));
        assertEquals(new Range(-1.5, 5.5), d.getRangeBounds(true));

        // try a Double.NEGATIVE_INFINITY
        d.add(Double.NEGATIVE_INFINITY, 0.0, "R1", "C3");
        assertEquals(new Range(Double.NEGATIVE_INFINITY, 4.5),
                d.getRangeBounds(false));
        assertEquals(new Range(Double.NEGATIVE_INFINITY, 5.5),
                d.getRangeBounds(true));

        // try a Double.POSITIVE_INFINITY
        d.add(Double.POSITIVE_INFINITY, 0.0, "R1", "C3");
        assertEquals(new Range(0.5, Double.POSITIVE_INFINITY),
                d.getRangeBounds(false));
        assertEquals(new Range(-1.5, Double.POSITIVE_INFINITY),
                d.getRangeBounds(true));
    }

    