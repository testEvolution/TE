@Test
    public void testEquals() {
        DialTextAnnotation a1 = new DialTextAnnotation("A1");
        DialTextAnnotation a2 = new DialTextAnnotation("A1");
        assertTrue(a1.equals(a2));

        // angle
        a1.setAngle(1.1);
        assertFalse(a1.equals(a2));
        a2.setAngle(1.1);
        assertTrue(a1.equals(a2));

        // radius
        a1.setRadius(9.9);
        assertFalse(a1.equals(a2));
        a2.setRadius(9.9);
        assertTrue(a1.equals(a2));

        // font
        Font f = new Font("SansSerif", Font.PLAIN, 14);
        a1.setFont(f);
        assertFalse(a1.equals(a2));
        a2.setFont(f);
        assertTrue(a1.equals(a2));

        // paint
        a1.setPaint(Color.RED);
        assertFalse(a1.equals(a2));
        a2.setPaint(Color.RED);
        assertTrue(a1.equals(a2));

        // label
        a1.setLabel("ABC");
        assertFalse(a1.equals(a2));
        a2.setLabel("ABC");
        assertTrue(a1.equals(a2));

        // check an inherited attribute
        a1.setVisible(false);
        assertFalse(a1.equals(a2));
        a2.setVisible(false);
        assertTrue(a1.equals(a2));
    }

    