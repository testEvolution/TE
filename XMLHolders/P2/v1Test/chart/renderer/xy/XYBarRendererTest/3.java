@Test
    public void testPublicCloneable() {
        XYBarRenderer r1 = new XYBarRenderer();
        assertTrue(r1 instanceof PublicCloneable);
    }

    