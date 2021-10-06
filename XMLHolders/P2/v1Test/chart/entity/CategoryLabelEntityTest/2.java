@Test
    public void testSerialization() {
        CategoryLabelEntity e1 = new CategoryLabelEntity("A",
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), "ToolTip", "URL");
        CategoryLabelEntity e2 = (CategoryLabelEntity) TestUtils.serialised(e1);
        assertEquals(e1, e2);
    }

}