@Test
    public void testSerialization() {
        LookupPaintScale g1 = new LookupPaintScale();
        LookupPaintScale g2 = (LookupPaintScale) TestUtils.serialised(g1);
        assertEquals(g1, g2);

        g1 = new LookupPaintScale(1.0, 2.0, new GradientPaint(1.0f, 2.0f,
                Color.RED, 3.0f, 4.0f, Color.YELLOW));
        g1.add(1.5, new GradientPaint(1.1f, 2.2f, Color.RED, 3.3f, 4.4f,
                Color.BLUE));
        g2 = (LookupPaintScale) TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    