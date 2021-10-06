@Test
    public void testGetRangeBounds2() {
        DefaultStatisticalCategoryDataset d1
                = new DefaultStatisticalCategoryDataset();
        d1.add(1.0, 2.0, "R1", "C1");
        assertEquals(new Range(1.0, 1.0), d1.getRangeBounds(false));
        assertEquals(new Range(-1.0, 3.0), d1.getRangeBounds(true));

        d1.add(10.0, 20.0, "R1", "C1");
        assertEquals(new Range(10.0, 10.0), d1.getRangeBounds(false));
        assertEquals(new Range(-10.0, 30.0), d1.getRangeBounds(true));
    }

    