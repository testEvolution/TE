@Test
    public void testHashCode() {
        XYShapeAnnotation a1 = new XYShapeAnnotation(
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(1.2f), Color.RED, Color.BLUE);
        XYShapeAnnotation a2 = new XYShapeAnnotation(
                new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0),
                new BasicStroke(1.2f), Color.RED, Color.BLUE);
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    