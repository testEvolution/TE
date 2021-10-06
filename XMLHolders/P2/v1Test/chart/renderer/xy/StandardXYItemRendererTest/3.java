@Test
    public void testPublicCloneable() {
        StandardXYItemRenderer r1 = new StandardXYItemRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    