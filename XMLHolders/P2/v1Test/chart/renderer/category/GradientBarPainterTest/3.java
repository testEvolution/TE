@Test
    public void testSerialization() {
        GradientBarPainter p1 = new GradientBarPainter(0.1, 0.2, 0.3);
        GradientBarPainter p2 = (GradientBarPainter) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}