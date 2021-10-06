@Test
    public void testSerialization() {
        Crosshair c1 = new Crosshair(1.0, new GradientPaint(1.0f, 2.0f,
                Color.RED, 3.0f, 4.0f, Color.BLUE), new BasicStroke(1.0f));
        Crosshair c2 = (Crosshair) TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

}