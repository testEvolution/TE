@Test
    public void testSerialization() {
        DefaultMultiValueCategoryDataset d1
                = new DefaultMultiValueCategoryDataset();
        DefaultMultiValueCategoryDataset d2 = (DefaultMultiValueCategoryDataset)
                TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    