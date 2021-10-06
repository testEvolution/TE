@Test
    public void testPublicCloneable() {
        StandardPieURLGenerator g1 = new StandardPieURLGenerator(
                "index.html?", "cat");
        assertFalse(g1 instanceof PublicCloneable);
    }

    