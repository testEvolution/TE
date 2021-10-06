@Test
    public void testPublicCloneable() {
        StandardPieSectionLabelGenerator g1
                = new StandardPieSectionLabelGenerator();
        assertTrue(g1 instanceof PublicCloneable);
    }

    