@Test
    public void testSerialization() {
        GrayPaintScale g1 = new GrayPaintScale();
        GrayPaintScale g2 = (GrayPaintScale) TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}