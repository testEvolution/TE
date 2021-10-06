@Test
    public void testCloning() throws CloneNotSupportedException {
        Rectangle r = new Rectangle(1, 2, 3, 4);
        LegendGraphic g1 = new LegendGraphic(r, Color.BLACK);
        LegendGraphic g2 = (LegendGraphic) g1.clone();
        assertTrue(g1 != g2);
        assertTrue(g1.getClass() == g2.getClass());
        assertTrue(g1.equals(g2));

        // check independence
        r.setBounds(4, 3, 2, 1);
        assertFalse(g1.equals(g2));
    }

    