@Test
    public void testSerialization() {
        TickLabelEntity e1 = new TickLabelEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0), "ToolTip", "URL");
        TickLabelEntity e2 = (TickLabelEntity) TestUtils.serialised(e1);
        assertEquals(e1, e2);
    }

}