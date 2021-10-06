@Test
    public void testSerialization() {
        StandardCategoryItemLabelGenerator g1
                = new StandardCategoryItemLabelGenerator("{2}",
                DateFormat.getInstance());
        StandardCategoryItemLabelGenerator g2 = (StandardCategoryItemLabelGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    