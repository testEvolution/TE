@Test
    public void testSerialization() {
        CategoryTick t1 = new CategoryTick("C1", new TextBlock(),
                TextBlockAnchor.CENTER, TextAnchor.CENTER, 1.5f);
        CategoryTick t2 = (CategoryTick) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}