@Test
    public void testSerialization() {
        StandardCategoryToolTipGenerator g1
                = new StandardCategoryToolTipGenerator("{2}",
                DateFormat.getInstance());
        StandardCategoryToolTipGenerator g2 = (StandardCategoryToolTipGenerator)
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    