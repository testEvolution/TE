@Test
    public void testPublicCloneable() {
        StandardCategorySeriesLabelGenerator g1
                = new StandardCategorySeriesLabelGenerator("{1}");
        assertTrue(g1 instanceof PublicCloneable);
    }

    