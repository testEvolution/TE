@Test
    public void testSerialization2() {
        PaintMap m1 = new PaintMap();
        m1.put("K1", Color.RED);
        m1.put("K2", new GradientPaint(1.0f, 2.0f, Color.GREEN, 3.0f, 4.0f,
                Color.YELLOW));
        PaintMap m2 = (PaintMap) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    