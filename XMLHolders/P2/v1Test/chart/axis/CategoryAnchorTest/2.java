@Test
    public void testSerialization() {
        CategoryAnchor a1 = CategoryAnchor.MIDDLE;
        CategoryAnchor a2 = (CategoryAnchor) TestUtils.serialised(a1);
        assertEquals(a1, a2);
        assertTrue(a1 == a2);
    }

}