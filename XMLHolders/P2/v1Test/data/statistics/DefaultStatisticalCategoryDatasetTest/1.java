@Test
    public void testEquals() {
        DefaultStatisticalCategoryDataset d1
                = new DefaultStatisticalCategoryDataset();
        DefaultStatisticalCategoryDataset d2
                = new DefaultStatisticalCategoryDataset();
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

    }

    