@Test
    public void testSerialization() {
        ItemLabelAnchor a1 = ItemLabelAnchor.INSIDE1;
        ItemLabelAnchor a2 = (ItemLabelAnchor) TestUtils.serialised(a1);
        assertTrue(a1 == a2);
    }

}