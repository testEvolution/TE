@Test
    public void testCloning() throws CloneNotSupportedException {
        // test default instance
        DialBackground b1 = new DialBackground();
        DialBackground b2 = (DialBackground) b1.clone();
        assertTrue(b1 != b2);
        assertTrue(b1.getClass() == b2.getClass());
        assertTrue(b1.equals(b2));

        // test a customised instance
        b1 = new DialBackground();
        b1.setPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.GREEN));
        b1.setGradientPaintTransformer(new StandardGradientPaintTransformer(
                GradientPaintTransformType.CENTER_VERTICAL));
        b2 = (DialBackground) b1.clone();
        assertTrue(b1 != b2);
        assertTrue(b1.getClass() == b2.getClass());
        assertTrue(b1.equals(b2));

        // check that the listener lists are independent
        MyDialLayerChangeListener l1 = new MyDialLayerChangeListener();
        b1.addChangeListener(l1);
        assertTrue(b1.hasListener(l1));
        assertFalse(b2.hasListener(l1));
    }

    