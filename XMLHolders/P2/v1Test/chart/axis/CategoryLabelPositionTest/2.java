@Test
    public void testSerialization() {
        CategoryLabelPosition p1 = new CategoryLabelPosition();
        CategoryLabelPosition p2 = (CategoryLabelPosition) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}