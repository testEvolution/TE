@Test
    public void testHashCode() {
        StandardPieSectionLabelGenerator g1
                = new StandardPieSectionLabelGenerator();
        StandardPieSectionLabelGenerator g2
                = new StandardPieSectionLabelGenerator();
        assertTrue(g1.equals(g2));
        assertTrue(g1.hashCode() == g2.hashCode());
    }

    