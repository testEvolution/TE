@Test
    public void testSerialization() {
        DefaultCategoryDataset d1 = new DefaultCategoryDataset();
        d1.setValue(23.4, "R1", "C1");
        DefaultCategoryDataset d2 = (DefaultCategoryDataset) 
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    