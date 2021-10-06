@Test
    public void testCloning2() throws CloneNotSupportedException {
        Rectangle r = new Rectangle(1, 2, 3, 4);
        LegendGraphic g1 = new LegendGraphic(r, Color.BLACK);
        Line2D l = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        g1.setLine(l);
        LegendGraphic g2 = (LegendGraphic) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        l.setLine(4.0, 3.0, 2.0, 1.0);
        assertFalse(g1.equals(g2));

    }

    