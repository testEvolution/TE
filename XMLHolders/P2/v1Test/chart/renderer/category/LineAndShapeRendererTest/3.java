@Test
    public void testPublicCloneable() {
        LineAndShapeRenderer r1 = new LineAndShapeRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    