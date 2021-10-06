@Test
    public void testSerialization() {
        StackedXYBarRenderer r1 = new StackedXYBarRenderer();
        r1.setSeriesPaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.YELLOW));
        StackedXYBarRenderer r2 = (StackedXYBarRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    