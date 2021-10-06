@Test
    public void testPublicCloneable() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        assertTrue(d instanceof PublicCloneable);
    }

    