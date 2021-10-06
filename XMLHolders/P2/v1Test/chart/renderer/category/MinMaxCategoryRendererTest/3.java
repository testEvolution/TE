@Test
    public void testPublicCloneable() {
        MinMaxCategoryRenderer r1 = new MinMaxCategoryRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    