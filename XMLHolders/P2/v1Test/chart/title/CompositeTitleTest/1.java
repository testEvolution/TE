@Test
    public void testEquals() {
        CompositeTitle t1 = new CompositeTitle(new BlockContainer());
        CompositeTitle t2 = new CompositeTitle(new BlockContainer());
        assertEquals(t1, t2);
        assertEquals(t2, t1);

        // margin
        t1.setMargin(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertFalse(t1.equals(t2));
        t2.setMargin(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertTrue(t1.equals(t2));

        // frame
        t1.setFrame(new BlockBorder(Color.RED));
        assertFalse(t1.equals(t2));
        t2.setFrame(new BlockBorder(Color.RED));
        assertTrue(t1.equals(t2));

        // padding
        t1.setPadding(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertFalse(t1.equals(t2));
        t2.setPadding(new RectangleInsets(1.0, 2.0, 3.0, 4.0));
        assertTrue(t1.equals(t2));

        // contained titles
        t1.getContainer().add(new TextTitle("T1"));
        assertFalse(t1.equals(t2));
        t2.getContainer().add(new TextTitle("T1"));
        assertTrue(t1.equals(t2));

        t1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertFalse(t1.equals(t2));
        t2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.YELLOW));
        assertTrue(t1.equals(t2));

    }

    