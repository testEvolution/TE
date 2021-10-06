@Test
    public void testSerialization() {
        PaintScaleLegend l1 = new PaintScaleLegend(new GrayPaintScale(),
                new NumberAxis("X"));
        PaintScaleLegend l2 = (PaintScaleLegend) TestUtils.serialised(l1);
        assertEquals(l1, l2);
    }

}