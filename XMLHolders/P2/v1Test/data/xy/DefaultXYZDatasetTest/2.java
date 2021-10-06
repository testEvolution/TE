@Test
    public void testPublicCloneable() {
        DefaultXYZDataset d1 = new DefaultXYZDataset();
        assertTrue(d1 instanceof PublicCloneable);
    }

    