@Test
    public void testSerialization2() {
        DefaultStatisticalCategoryDataset d1
            = new DefaultStatisticalCategoryDataset();
        d1.add(1.2, 3.4, "Row 1", "Column 1");
        DefaultStatisticalCategoryDataset d2 = 
                (DefaultStatisticalCategoryDataset) TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    