@Test
    public void testPublicCloneable() {
        DefaultTableXYDataset d1 = new DefaultTableXYDataset();
        assertTrue(d1 instanceof PublicCloneable);
    }

    