@Test
    public void testSerialization1() {
        DefaultStatisticalCategoryDataset d1
            = new DefaultStatisticalCategoryDataset();
        d1.add(1.1, 2.2, "R1", "C1");
        d1.add(3.3, 4.4, "R1", "C2");
        d1.add(null, 5.5, "R1", "C3");
        d1.add(6.6, null, "R2", "C3");
        DefaultStatisticalCategoryDataset d2 = 
                (DefaultStatisticalCategoryDataset) TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    