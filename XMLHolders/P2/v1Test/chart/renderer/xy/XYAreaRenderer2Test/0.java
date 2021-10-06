@Test
    public void testEquals() {
        XYAreaRenderer2 r1 = new XYAreaRenderer2();
        XYAreaRenderer2 r2 = new XYAreaRenderer2();
        assertEquals(r1, r2);

        r1.setOutline(!r1.isOutline());
        assertFalse(r1.equals(r2));
        r2.setOutline(r1.isOutline());
        assertTrue(r1.equals(r2));

        r1.setLegendArea(new Rectangle(1, 2, 3, 4));
        assertFalse(r1.equals(r2));
        r2.setLegendArea(new Rectangle(1, 2, 3, 4));
        assertTrue(r1.equals(r2));
    }

    