@Test
    public void testSerialization() {
        XYErrorRenderer r1 = new XYErrorRenderer();
        r1.setErrorPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.WHITE));
        XYErrorRenderer r2 = (XYErrorRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    