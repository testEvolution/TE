@Test
    public void testCloning() throws CloneNotSupportedException {
        XYAreaRenderer2 r1 = new XYAreaRenderer2();
        Rectangle rect = new Rectangle(1, 2, 3, 4);
        r1.setLegendArea(rect);
        XYAreaRenderer2 r2 = (XYAreaRenderer2) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        // check independence
        rect.setBounds(99, 99, 99, 99);
        assertFalse(r1.equals(r2));
    }

    