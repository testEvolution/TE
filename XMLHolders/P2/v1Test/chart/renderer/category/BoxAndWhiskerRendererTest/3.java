@Test
    public void testPublicCloneable() {
        BoxAndWhiskerRenderer r1 = new BoxAndWhiskerRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    