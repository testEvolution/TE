@Test
    public void testSerialization() {
        CategoryLabelPositions p1 = CategoryLabelPositions.STANDARD;
        CategoryLabelPositions p2 = (CategoryLabelPositions) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}