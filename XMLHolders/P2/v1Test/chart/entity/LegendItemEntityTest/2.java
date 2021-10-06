@Test
    public void testSerialization() {
        LegendItemEntity e1 = new LegendItemEntity(new Rectangle2D.Double(1.0,
                2.0, 3.0, 4.0));
        LegendItemEntity e2 = (LegendItemEntity) TestUtils.serialised(e1);
        assertEquals(e1, e2);
    }

}