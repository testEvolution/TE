@Test
    public void testEquals() {
        Outlier out1 = new Outlier(1.0, 2.0, 3.0);
        Outlier out2 = new Outlier(1.0, 2.0, 3.0);
        assertTrue(out1.equals(out2));
        assertTrue(out2.equals(out1));

        out1.setPoint(new Point2D.Double(2.0, 2.0));
        assertFalse(out1.equals(out2));
        out2.setPoint(new Point2D.Double(2.0, 2.0));
        assertTrue(out1.equals(out2));

        out1.setPoint(new Point2D.Double(2.0, 3.0));
        assertFalse(out1.equals(out2));
        out2.setPoint(new Point2D.Double(2.0, 3.0));
        assertTrue(out1.equals(out2));

        out1.setRadius(4.0);
        assertFalse(out1.equals(out2));
        out2.setRadius(4.0);
        assertTrue(out1.equals(out2));
    }

    