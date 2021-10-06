@Test
    public void testSerialization() {
        PieSectionEntity e1 = new PieSectionEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), new DefaultPieDataset(), 0, 1, "Key",
                "ToolTip", "URL");
        StandardEntityCollection c1 = new StandardEntityCollection();
        c1.add(e1);
        StandardEntityCollection c2 = (StandardEntityCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

}