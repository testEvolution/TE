@Test
    public void testCloning() throws CloneNotSupportedException {
        // try a default instance
        StandardDialScale s1 = new StandardDialScale();
        StandardDialScale s2 = (StandardDialScale) s1.clone();
        assertTrue(s1 != s2);
        assertTrue(s1.getClass() == s2.getClass());
        assertTrue(s1.equals(s2));

        // try a customised instance
        s1 = new StandardDialScale();
        s1.setExtent(123.4);
        s1.setMajorTickPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.WHITE));
        s1.setMajorTickStroke(new BasicStroke(2.0f));
        s2 = (StandardDialScale) s1.clone();
        assertTrue(s1 != s2);
        assertTrue(s1.getClass() == s2.getClass());
        assertTrue(s1.equals(s2));

        // check that the listener lists are independent
        MyDialLayerChangeListener l1 = new MyDialLayerChangeListener();
        s1.addChangeListener(l1);
        assertTrue(s1.hasListener(l1));
        assertFalse(s2.hasListener(l1));
    }

    