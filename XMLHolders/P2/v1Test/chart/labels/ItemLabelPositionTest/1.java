@Test
    public void testSerialization() {
        ItemLabelPosition p1 = new ItemLabelPosition();
        ItemLabelPosition p2 = (ItemLabelPosition) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}