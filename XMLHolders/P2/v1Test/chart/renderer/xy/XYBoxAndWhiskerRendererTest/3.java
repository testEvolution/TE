@Test
    public void testPublicCloneable() {
        XYBoxAndWhiskerRenderer r1 = new XYBoxAndWhiskerRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    