@Test
    public void testEquals() {
        // use the TextTitle class because it is a concrete subclass
        Title t1 = new TextTitle();
        Title t2 = new TextTitle();
        assertEquals(t1, t2);

        t1.setPosition(RectangleEdge.LEFT);
        assertFalse(t1.equals(t2));
        t2.setPosition(RectangleEdge.LEFT);
        assertTrue(t1.equals(t2));

        t1.setHorizontalAlignment(HorizontalAlignment.RIGHT);
        assertFalse(t1.equals(t2));
        t2.setHorizontalAlignment(HorizontalAlignment.RIGHT);
        assertTrue(t1.equals(t2));

        t1.setVerticalAlignment(VerticalAlignment.BOTTOM);
        assertFalse(t1.equals(t2));
        t2.setVerticalAlignment(VerticalAlignment.BOTTOM);
        assertTrue(t1.equals(t2));

        t1.setVisible(false);
        assertFalse(t1.equals(t2));
        t2.setVisible(false);
        assertTrue(t1.equals(t2));
    }

    