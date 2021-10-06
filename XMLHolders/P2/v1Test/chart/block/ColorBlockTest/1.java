@Test
    public void testCloning() {
        GradientPaint gp = new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f,
                Color.BLUE);
        Rectangle2D bounds1 = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0);
        ColorBlock b1 = new ColorBlock(gp, 1.0, 2.0);
        b1.setBounds(bounds1);
        ColorBlock b2 = null;

        try {
            b2 = (ColorBlock) b1.clone();
        }
        catch (CloneNotSupportedException e) {
            fail(e.toString());
        }
        assertTrue(b1 != b2);
        assertTrue(b1.getClass() == b2.getClass());
        assertTrue(b1.equals(b2));

        // check independence
        bounds1.setRect(1.0, 2.0, 3.0, 4.0);
        assertFalse(b1.equals(b2));
        b2.setBounds(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0));
        assertTrue(b1.equals(b2));
    }

    