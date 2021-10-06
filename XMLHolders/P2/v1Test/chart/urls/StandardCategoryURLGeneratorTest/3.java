@Test
    public void testSerialization() {
        StandardCategoryURLGenerator g1 = new StandardCategoryURLGenerator(
                "index.html?");
        StandardCategoryURLGenerator g2 = (StandardCategoryURLGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}