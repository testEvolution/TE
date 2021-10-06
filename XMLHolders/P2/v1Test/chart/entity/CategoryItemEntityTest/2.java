@Test
    public void testSerialization() {
        DefaultCategoryDataset d = new DefaultCategoryDataset();
        d.addValue(1.0, "R1", "C1");
        d.addValue(2.0, "R1", "C2");
        d.addValue(3.0, "R2", "C1");
        d.addValue(4.0, "R2", "C2");
        CategoryItemEntity e1 = new CategoryItemEntity(new Rectangle2D.Double(
                1.0, 2.0, 3.0, 4.0), "ToolTip", "URL", d, "R2", "C2");
        CategoryItemEntity e2 = (CategoryItemEntity) TestUtils.serialised(e1);
        assertEquals(e1, e2);
    }

}