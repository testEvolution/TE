@Test
    public void testPublicCloneable() {
        StatisticalLineAndShapeRenderer r1
                = new StatisticalLineAndShapeRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    