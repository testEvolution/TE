@Test
    public void testSerialization() {
        PieSectionEntity e1 = new PieSectionEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), new DefaultPieDataset(), 1, 2, "Key",
                "ToolTip", "URL");
        PieSectionEntity e2 = (PieSectionEntity) TestUtils.serialised(e1);
        assertEquals(e1, e2);
    }

}