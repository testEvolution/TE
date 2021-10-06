@Test
    public void testPublicCloneable() {
        DefaultWindDataset d1 = new DefaultWindDataset();
        assertTrue(d1 instanceof PublicCloneable);
    }

    