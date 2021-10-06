@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardPieSectionLabelGenerator g1
                = new StandardPieSectionLabelGenerator();
        StandardPieSectionLabelGenerator g2 
                = (StandardPieSectionLabelGenerator) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));
    }

    